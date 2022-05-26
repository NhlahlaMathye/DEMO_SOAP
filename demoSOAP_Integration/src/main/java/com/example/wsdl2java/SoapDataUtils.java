package com.example.wsdl2java;

import okhttp3.*;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceStub;
import org.w3c.dom.Document;
import wcs.ListCountryNamesByNamesResponse;
import wcs.TCountryName;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;
import org.apache.axis2.AxisFault;
import org.oorsprong.wsimport.generated.CountryInfoService;
import org.oorsprong.wsimport.generated.CountryInfoServiceSoapType;
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
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;

public class SoapDataUtils {

    private static final String BASE_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String MEDIA_TYPE = "text/xml; charset=utf-8";
    static final Logger logger = Logger.getLogger(SoapDataUtils.class.getSimpleName());

    static final String ENDPOINT = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static URL url = null;
    static {
        try {
            url = URI.create(ENDPOINT).toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static final CountryInfoService service = new CountryInfoService(url);
    private static final CountryInfoServiceSoapType port = service.getPort(CountryInfoServiceSoapType.class);

    static CountryInfoServiceStub serviceStub;
    static {
        try {
            serviceStub = new CountryInfoServiceStub("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL");
        } catch (AxisFault e) {
            e.printStackTrace();
        }
    }

    public SoapDataUtils() throws MalformedURLException, AxisFault {
    }

    public static void listOfLanguages() throws Exception {

        CountryInfoServiceStub.ArrayOftLanguage result = serviceStub.listOfLanguagesByName(new CountryInfoServiceStub.ListOfLanguagesByName()).getListOfLanguagesByNameResult();

        for(CountryInfoServiceStub.TLanguage language: result.getTLanguage())
        {
            System.out.println("Language: " + language.getSName() + ", ("+language.getSISOCode()+")."+"\n");
        }
    }

    public static void listOfCountries() throws Exception{
        CountryInfoServiceStub.ArrayOftCountryCodeAndName codeAndName = serviceStub.listOfCountryNamesByName(new CountryInfoServiceStub.ListOfCountryNamesByName()).getListOfCountryNamesByNameResult();

        for (CountryInfoServiceStub.TCountryCodeAndName tCountryCodeAndName: codeAndName.getTCountryCodeAndName())
        {
            System.out.println("Country:" + tCountryCodeAndName.getSName() + ", ("+tCountryCodeAndName.getSISOCode()+")."+"\n");
        }
    }

    public static  void getCountriesByName()
    {
        for (int x = 0; x < port.listOfCountryNamesByName().tCountryCodeAndName.size(); x++) {

            String name = port.listOfCountryNamesByName().tCountryCodeAndName.get(x).getSName();
            String isoCode = port.listOfCountryNamesByName().tCountryCodeAndName.get(x).getSISOCode();
            System.out.println("Country Name:" + name + "\nCountry Code:" + isoCode + "\n" + "");
        }
    }

        public static void getLanguagesByName()
    {
        for (int i = 0; i < port.listOfLanguagesByName().tLanguage.size(); i++)
        {
            String languageName = port.listOfLanguagesByName().tLanguage.get(i).getSName();
            String languageCode = port.listOfLanguagesByName().tLanguage.get(i).getSISOCode();
            System.out.println("Language Name:" + languageName + "\nLanguage Code: " + languageCode + "\n");
        }
    }

    public static void checkListOfCountryAndName() throws AxisFault, MalformedURLException {
        TCountryName listOfCountryName = new TCountryName();
        String objectXmlString = SoapDataUtils.marshallObject(listOfCountryName);
        String objectSoapString = new SoapDataUtils().createGenericSoapString(objectXmlString);
        String apiCallResponse = SoapDataUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListCountryNamesByNamesResponse listCountries = (ListCountryNamesByNamesResponse) SoapDataUtils.unMarshallObject(apiCallResponse, ListCountryNamesByNamesResponse.class);

        assert listCountries != null;
        for (int i = 0; i < listCountries.getListCountryNamesByNamesResult().gettCountryNames().size(); i++)
        {
            String countyName = listCountries.getListCountryNamesByNamesResult().gettCountryNames().get(i).getName();
            String countryCode = listCountries.getListCountryNamesByNamesResult().gettCountryNames().get(i).getIsoCOde();
            System.out.println(" Country Name: " + countyName + " \n Country Code: " + countryCode + " \n");
        }
    }

    public static void checkListOfLanguages() throws AxisFault, MalformedURLException {
        TLanguage listOfLanguagesByName = new TLanguage();
        String objectXmlString = SoapDataUtils.marshallObject(listOfLanguagesByName);
        String objectSoapString = new SoapDataUtils().createGenericSoapString(objectXmlString);
        String apiCallResponse = SoapDataUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );
        //logger.info("Here is the response " + apiCallResponse);
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListOfLanguagesByNameResponse listLanguages = (ListOfLanguagesByNameResponse) SoapDataUtils.unMarshallObject(apiCallResponse, ListOfLanguagesByNameResponse.class);
        assert listLanguages != null;
        for(int x = 0; x < listLanguages.getListOfLanguagesByNameResult().getTLanguages().size(); x++)
        {
            String name = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getName();
            String code = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getIsoCode();
            System.out.println(" Language name :" + name + "\n Language Code :" + code + "\n");
        }
    }



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
