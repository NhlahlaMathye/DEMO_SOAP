import java.util.InputMismatchException;
import java.util.Scanner;

public class SoapDataApp {

    static boolean checkInfo;
    static int programLevel = 0;

    //static final Logger logger = Logger.getLogger("DEMO");

    public static void main(String[] args)
    {

        checkInfo = false;
        while (programLevel != 9)
        {
            SoapDataApp.mainProgramData(programLevel);
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
                    SoapDataUtils.checkListOfLanguages();
                    programLevel = 0;
                    break;

                case 2:
                    SoapDataUtils.checkListOfCountryAndName();
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
