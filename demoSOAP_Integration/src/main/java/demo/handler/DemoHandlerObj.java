package demo.handler;

import okhttp3.*;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Logger;


public class DemoHandlerObj {

    static final Logger logger = Logger.getLogger(DemoHandlerObj.class.getSimpleName());

    public static String marshallObject(Object object){
        StringWriter sw = new StringWriter();
        String objXMLString = "";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(object, sw);
            objXMLString = sw.toString();
            //logger.info(object.getClass().getSimpleName().toString()+" XML:\n"+objXMLString);
        } catch (JAXBException e) {
            logger.info("Error marshalling: "+object.getClass().getSimpleName()+"\n" + e.getMessage());
            return null;
        }

        return objXMLString;
    }

    public static Object unMarshallObject(String responseString, Class responseClass){
        Object responseObject;
        try {
            SOAPMessage message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(responseString.getBytes())); //Create soap message from api response
            Unmarshaller unmarshaller = JAXBContext.newInstance(responseClass).createUnmarshaller(); //Create CreateXMTransactionResponse unmarshaller
            responseObject = unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument()); //Map to CreateXMTransactionResponse object
        }
        catch(Exception e){
            logger.info("Error unmarshalling: "+responseClass.getSimpleName()+"Response String: \n" + e.getMessage());
            return null;
        }

        return responseObject;
    }

    public static Document loadXMLFromString(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();

        return builder.parse(new ByteArrayInputStream(xml.getBytes()));
    }

    public static SOAPMessage createSoapEnvelope(String xml) throws SOAPException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();

        SOAPBody soapBody = envelope.getBody();
        Document document = null;
        try {
            document = loadXMLFromString(xml);
        } catch (Exception e) {
            logger.info("createSoapEnvelope Exception: " + e.getMessage());
        }
        soapBody.addDocument(document);
        return soapMessage;
    }

    public String getSoapMessageFromString(String xml) throws SOAPException, IOException {
        SOAPMessage soapEnvelope = createSoapEnvelope(xml);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapEnvelope.writeTo(out);

        return new String(out.toByteArray());
    }

    public String createGenericSoapString(String xmlString) {
        String soapMessageFromString = "";
        try {
            soapMessageFromString = getSoapMessageFromString(xmlString);
        } catch (SOAPException | IOException e) {
            e.printStackTrace();
        }
        return soapMessageFromString;
    }

    public static String apiRequest(String requestBody, String url, String mediaType)
    {
        final MediaType SOAP_MEDIA_TYPE = MediaType.parse(mediaType);

        RequestBody body = RequestBody.create(SOAP_MEDIA_TYPE, requestBody);

        final Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Content-type","text/xml; charset=UTF-8")
                .build();
        OkHttpClient client = new OkHttpClient();

        try {
            Response responded = client.newCall(request).execute();
            return  responded.body().string();
        }catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
