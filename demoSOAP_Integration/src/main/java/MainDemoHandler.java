import config.DemoUtils;
import config.Utilities;
import wcs.ListCountryNamesByNamesResponse;
import wcs.TCountryName;
import wss.ListOfLanguagesByNameResponse;
import wss.TLanguage;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainDemoHandler {


    static boolean checkInfo;
    static int programLevel = 0;

    static final Logger logger = Logger.getLogger("DEMO");

    public static void main(String[] args)
    {

        checkInfo = false;
        while (programLevel != 9)
        {
            MainDemoHandler.mainProgramData(programLevel);
        }

    }

    private static void mainProgramData(int inputUser) throws InputMismatchException
    {
        Scanner sc = new Scanner(System.in);

        try{
            switch (inputUser){

                case 0:
                    System.out.println("Select number for information you want to retrieve" +
                            "\n" +
                            "\n 1. List of languages" +
                            "\n 2. List of countries" +
                            "\n" +
                            "\n Enter (9) to exit program");
                    programLevel = sc.nextInt();
                    break;
                case 1:
                    Utilities.checkListOfLanguages();
                    programLevel = 0;
                    break;

                case 2:
                    Utilities.checkListOfCountryAndName();
                    programLevel = 0;
                    break;

                default:
                    break;
            }
        }catch (InputMismatchException e)
        {
            System.out.println("Expects a number!!");
        }

    }


}
