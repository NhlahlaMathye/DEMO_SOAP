import config.DemoUtils;
import wss.ListOfLanguagesByName;

import java.util.logging.Logger;

public class MainDemoHandler {

    private static final String BASE_URL = "http://www.oorsprong.org/websamples.countryinfo";
    private static final String MEDIA_TYPE = "UTF-8";

    static final Logger logger = Logger.getLogger("DEMO");

    public static void main(String[] args)
    {

        checkListOfLanguages();
    }


    public static void checkListOfLanguages()
    {
        ListOfLanguagesByName listOfLanguagesByName = new ListOfLanguagesByName();
        listOfLanguagesByName.setIsoCode("zun");
        listOfLanguagesByName.setName("Zuni");

        String objectXmlString = DemoUtils.marshallObject(listOfLanguagesByName);
        String objectSoapString = new DemoUtils().createGenericSoapString(objectXmlString);
        logger.info("Check request body: \n" + objectSoapString);

        String apiCallResponse = DemoUtils.apiRequest(objectSoapString, BASE_URL, MEDIA_TYPE );

        if(apiCallResponse == null)
        {
            System.out.println("API Response call is null " + objectSoapString + " " + apiCallResponse );

        }
        else{
            System.out.println("Here is the response: " + apiCallResponse);
        }


    }
}
