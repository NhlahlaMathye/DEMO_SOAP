import config.DemoUtils;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;

import java.util.logging.Logger;

public class MainDemoHandler {

    private static final String BASE_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String MEDIA_TYPE = "text/xml; charset=utf-8";

    static final Logger logger = Logger.getLogger("DEMO");

    public static void main(String[] args)
    {

        checkListOfLanguages();
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
