package com.example.wsdl2java;

import config.DemoHandlerObj;
import wcs.ListCountryNamesByNamesResponse;
import wcs.TCountryName;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;
import org.apache.axis2.AxisFault;
import org.oorsprong.wsimport.generated.CountryInfoService;
import org.oorsprong.wsimport.generated.CountryInfoServiceSoapType;
import org.oorsprong.www.websamples_countryinfo.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.rmi.RemoteException;

public class SoapDataUtils {

    private static final String BASE_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String MEDIA_TYPE = "text/xml; charset=utf-8";

    private static CountryInfoServiceStub stub;
    static {
        try {
            stub = new CountryInfoServiceStub();
        } catch (AxisFault e) {
            e.printStackTrace();
        }
    }

    static final String ENDPOINT = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private final URL url = URI.create(ENDPOINT).toURL();
    private   final CountryInfoService service = new CountryInfoService(url);
    private final CountryInfoServiceSoapType port = service.getPort(CountryInfoServiceSoapType.class);

    public SoapDataUtils() throws MalformedURLException {
    }

    public   void getCountriesByName()
    {
        for (int x = 0; x < port.listOfCountryNamesByName().tCountryCodeAndName.size(); x++) {

            String name = port.listOfCountryNamesByName().tCountryCodeAndName.get(x).getSName();
            String isoCode = port.listOfCountryNamesByName().tCountryCodeAndName.get(x).getSISOCode();
            System.out.println("Country Name:" + name + "\nCountry Code:" + isoCode + "\n" + "");
        }
    }

    public void getLanguagesByName()
    {
        for (int i = 0; i < port.listOfLanguagesByName().tLanguage.size(); i++)
        {
            String languageName = port.listOfLanguagesByName().tLanguage.get(i).getSName();
            String languageCode = port.listOfLanguagesByName().tLanguage.get(i).getSISOCode();
            System.out.println("Language Name:" + languageName + "\nLanguage Code: " + languageCode + "\n");
        }
    }

    public void listOfCountries() throws RemoteException {
        ListOfCountryNamesByNameDocument requestDoc = ListOfCountryNamesByNameDocument.Factory.newInstance();
        ListOfCountryNamesByNameDocument.ListOfCountryNamesByName request = ListOfCountryNamesByNameDocument.ListOfCountryNamesByName.Factory.newInstance();

        requestDoc.setListOfCountryNamesByName(request);
        ListOfCountryNamesByNameResponseDocument responseDocument = stub.listOfCountryNamesByName(requestDoc);
        assert responseDocument != null;
        ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse response = responseDocument.getListOfCountryNamesByNameResponse();
        assert response != null;

        ArrayOftCountryCodeAndName result = response.getListOfCountryNamesByNameResult();
        assert result != null;

        for (int x = 0; x < result.sizeOfTCountryCodeAndNameArray(); x++)
        {
            String name = result.getTCountryCodeAndNameArray(x).getSName();
            String code = result.getTCountryCodeAndNameArray(x).getSISOCode();
            System.out.println("Country Name: " + name + "\nCountry Code:" + code + "\n");
        }
    }

    public void listOfLanguages() throws RemoteException{

        ListOfLanguagesByNameDocument requestLanguages = ListOfLanguagesByNameDocument.Factory.newInstance();
        ListOfLanguagesByNameDocument.ListOfLanguagesByName reqLanguage = ListOfLanguagesByNameDocument.ListOfLanguagesByName.Factory.newInstance();
        requestLanguages.setListOfLanguagesByName(reqLanguage);

        ListOfLanguagesByNameResponseDocument responseLanguage = stub.listOfLanguagesByName(requestLanguages);
        assert responseLanguage != null;
        ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse languagesByNameResponse =  responseLanguage.getListOfLanguagesByNameResponse();
        assert languagesByNameResponse != null;

        ArrayOftLanguage results = languagesByNameResponse.getListOfLanguagesByNameResult();
        assert results != null;
        for (int l = 0; l < results.sizeOfTLanguageArray(); l++)
        {
            String name = results.getTLanguageArray(l).getSName();
            String isoCode = results.getTLanguageArray(l).getSISOCode();
            System.out.println("Language Name:" + name + "\nLanguage Code:" + isoCode + "\n");
        }
    }

    public static void checkListOfCountryAndName()
    {
        TCountryName listOfCountryName = new TCountryName();

        String objectXmlString = DemoHandlerObj.marshallObject(listOfCountryName);
        String objectSoapString = new DemoHandlerObj().createGenericSoapString(objectXmlString);
        String apiCallResponse = DemoHandlerObj.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }

        ListCountryNamesByNamesResponse listCountries = (ListCountryNamesByNamesResponse) DemoHandlerObj.unMarshallObject(apiCallResponse, ListCountryNamesByNamesResponse.class);

        assert listCountries != null;
        for (int i = 0; i < listCountries.getListCountryNamesByNamesResult().gettCountryNames().size(); i++)
        {
            String countyName = listCountries.getListCountryNamesByNamesResult().gettCountryNames().get(i).getName();
            String countryCode = listCountries.getListCountryNamesByNamesResult().gettCountryNames().get(i).getIsoCOde();

            System.out.println(" Country Name: " + countyName + " \n Country Code: " + countryCode + " \n");
        }
    }

    public static void checkListOfLanguages()
    {
        TLanguage listOfLanguagesByName = new TLanguage();

        String objectXmlString = DemoHandlerObj.marshallObject(listOfLanguagesByName);
        String objectSoapString = new DemoHandlerObj().createGenericSoapString(objectXmlString);
        String apiCallResponse = DemoHandlerObj.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        //logger.info("Here is the response " + apiCallResponse);
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListOfLanguagesByNameResponse listLanguages = (ListOfLanguagesByNameResponse) DemoHandlerObj.unMarshallObject(apiCallResponse, ListOfLanguagesByNameResponse.class);

        assert listLanguages != null;
        //System.out.println(listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(0).getName());

        for(int x = 0; x < listLanguages.getListOfLanguagesByNameResult().getTLanguages().size(); x++)
        {
            String name = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getName();
            String code = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getIsoCode();

            System.out.println(" Language name :" + name + "\n Language Code :" + code + "\n");
        }
    }
}
