import config.DemoUtils;
import wcs.ListCountryNamesByNamesResponse;
import wcs.TCountryName;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;

public class SoapDataUtils {

    private static final String BASE_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String MEDIA_TYPE = "text/xml; charset=utf-8";

    public static void checkListOfCountryAndName()
    {
        TCountryName listOfCountryName = new TCountryName();

        String objectXmlString = DemoUtils.marshallObject(listOfCountryName);
        String objectSoapString = new DemoUtils().createGenericSoapString(objectXmlString);
        String apiCallResponse = DemoUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }

        ListCountryNamesByNamesResponse listCountries = (ListCountryNamesByNamesResponse) DemoUtils.unMarshallObject(apiCallResponse, ListCountryNamesByNamesResponse.class);

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

        String objectXmlString = DemoUtils.marshallObject(listOfLanguagesByName);
        String objectSoapString = new DemoUtils().createGenericSoapString(objectXmlString);
        String apiCallResponse = DemoUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        //logger.info("Here is the response " + apiCallResponse);
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );
        }
        ListOfLanguagesByNameResponse listLanguages = (ListOfLanguagesByNameResponse) DemoUtils.unMarshallObject(apiCallResponse, ListOfLanguagesByNameResponse.class);

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
