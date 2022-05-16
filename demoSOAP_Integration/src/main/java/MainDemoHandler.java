import config.DemoUtils;
import wss.Language;
import wss.ListOfLanguagesByName;
import wss.ListOfLanguagesByNameResponse;

import java.util.Map;
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
        ListOfLanguagesByName listOfLanguagesByName = new ListOfLanguagesByName();

        String objectXmlString = DemoUtils.marshallObject(listOfLanguagesByName);
        String objectSoapString = new DemoUtils().createGenericSoapString(objectXmlString);
       // logger.info("Check request body: \n" + objectSoapString);

        String apiCallResponse = DemoUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        logger.info("Here is the response " + apiCallResponse);
        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );

        }
        ListOfLanguagesByNameResponse listLanguages = (ListOfLanguagesByNameResponse) DemoUtils.unMarshallObject(apiCallResponse, ListOfLanguagesByNameResponse.class);

        assert listLanguages != null;
        System.out.println(listLanguages.getListOfLanguagesByName());

    }
}
