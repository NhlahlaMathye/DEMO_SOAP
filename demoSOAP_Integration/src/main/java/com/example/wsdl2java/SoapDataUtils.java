package com.example.wsdl2java;

import demo.handler.SoapDataHandlerObject;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceStub;
import org.oorsprong.www.websamples_countryinfo.*;
import wcs.ListCountryNamesByNamesResponse;
import wcs.TCountryName;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;
import org.apache.axis2.AxisFault;
import org.oorsprong.wsimport.generated.CountryInfoService;
import org.oorsprong.wsimport.generated.CountryInfoServiceSoapType;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.rmi.RemoteException;

public class SoapDataUtils {

    private static final String BASE_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String MEDIA_TYPE = "text/xml; charset=utf-8";


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


    public static void listOfCountries() throws RemoteException {
//        ListOfCountryNamesByNameDocument requestDoc = ListOfCountryNamesByNameDocument.Factory.newInstance();
//        ListOfCountryNamesByNameDocument.ListOfCountryNamesByName request = ListOfCountryNamesByNameDocument.ListOfCountryNamesByName.Factory.newInstance();
//
//        requestDoc.setListOfCountryNamesByName(request);
//        ListOfCountryNamesByNameResponseDocument responseDocument = stub.listOfCountryNamesByName(requestDoc);
//        assert responseDocument != null;
//        ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse response = responseDocument.getListOfCountryNamesByNameResponse();
//        assert response != null;
//
//        ArrayOftCountryCodeAndName result = response.getListOfCountryNamesByNameResult();
//        assert result != null;
//
//        for (int x = 0; x < result.sizeOfTCountryCodeAndNameArray(); x++)
//        {
//            String name = result.getTCountryCodeAndNameArray(x).getSName();
//            String code = result.getTCountryCodeAndNameArray(x).getSISOCode();
//            System.out.println("Country Name: " + name + "\nCountry Code:" + code + "\n");
//        }
    }

    public static void listOfLanguages() throws Exception {


    }

    public static void checkListOfCountryAndName()
    {
        TCountryName listOfCountryName = new TCountryName();
        String objectXmlString = SoapDataHandlerObject.marshallObject(listOfCountryName);
        String objectSoapString = new SoapDataHandlerObject().createGenericSoapString(objectXmlString);
        String apiCallResponse = SoapDataHandlerObject.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListCountryNamesByNamesResponse listCountries = (ListCountryNamesByNamesResponse) SoapDataHandlerObject.unMarshallObject(apiCallResponse, ListCountryNamesByNamesResponse.class);

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
        String objectXmlString = SoapDataHandlerObject.marshallObject(listOfLanguagesByName);
        String objectSoapString = new SoapDataHandlerObject().createGenericSoapString(objectXmlString);
        String apiCallResponse = SoapDataHandlerObject.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );
        //logger.info("Here is the response " + apiCallResponse);
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListOfLanguagesByNameResponse listLanguages = (ListOfLanguagesByNameResponse) SoapDataHandlerObject.unMarshallObject(apiCallResponse, ListOfLanguagesByNameResponse.class);
        assert listLanguages != null;
        for(int x = 0; x < listLanguages.getListOfLanguagesByNameResult().getTLanguages().size(); x++)
        {
            String name = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getName();
            String code = listLanguages.getListOfLanguagesByNameResult().getTLanguages().get(x).getIsoCode();
            System.out.println(" Language name :" + name + "\n Language Code :" + code + "\n");
        }
    }
}
