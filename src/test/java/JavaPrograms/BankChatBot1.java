package JavaPrograms;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankChatBot1 {
    static double availableBalance;
    static String keyWord;
    int count;

    public static void main(String[] args) {

        BankChatBot1 bankChatBot1=new BankChatBot1();



        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine())
        {
            keyWord=sc.nextLine();
            System.out.println(keyWord);

            if(keyWord.contains("withdraw"))
            {

                double extracterAmount=bankChatBot1.extractAmountFromString();
                if(availableBalance>extracterAmount)
                    availableBalance=availableBalance-extracterAmount;
                else
                    System.out.println("Insufficient Balance");
            }

            if(keyWord.contains("show"))
            {

                System.out.println(availableBalance);
            }

            if(keyWord.contains("deposit"))
            {

                double depositAmount=bankChatBot1.extractAmountFromString();
                availableBalance=availableBalance+depositAmount;
            }

        }



    }

    public double extractAmountFromString()
    {
        double integerValue = 0;

        List<String> listOfString= Arrays.asList(keyWord.split("[\\s.]+"));
        for(int i=0;i<listOfString.size();i++) {
            try {
                integerValue = Integer.parseInt(listOfString.get(i));
                break;
            } catch (Exception e) {
                System.out.println(listOfString.get(i)+"is a string");
            }
        }
        return integerValue;
    }
}
