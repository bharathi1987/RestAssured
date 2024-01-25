package JavaPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankChatBot {
    static double availableBalance;
   static String keyWord;
   int count;

    public static void main(String[] args) {

        BankChatBot bankChatBot=new BankChatBot();



        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine())
        {
             keyWord=sc.nextLine();
            System.out.println(keyWord);

            if(keyWord.contains("withdraw"))
            {

                double extracterAmount=bankChatBot.extractAmountFromString();
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

                double depositAmount=bankChatBot.extractAmountFromString();
                availableBalance=availableBalance+depositAmount;
            }

        }



    }

    public double extractAmountFromString()
    {
        double integerValue = 0;
        Pattern pattern = Pattern.compile("\\d+");
        // Create a Matcher object
        Matcher matcher = pattern.matcher(keyWord);

        // Find the first match
        if (matcher.find()) {
            // Extract the matched integer
             integerValue = Integer.parseInt(matcher.group());
            System.out.println("Extracted integer value: " + integerValue);
        } else {
            System.out.println("No integer found in the string.");
        }
/*

        while(matcher.find())
        {
            count++;
            if(count==2)
            {
                integerValue = Integer.parseInt(matcher.group());
                System.out.println("Extracted integer value: " + integerValue);

            }
        }
*/

        return integerValue;
    }
}
