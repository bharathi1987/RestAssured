package JavaPrograms;

import java.util.regex.Pattern;

public class InterviewTest {

    // print special character from string


    public static void main(String[] args) {
        String test = "$(*Bharathi995";

        for(int i=0;i<test.length();i++)
        {
            if (!Character.isLetter(test.charAt(i)) && !Character.isDigit(test.charAt(i)))
            {
                System.out.println(test.charAt(i));
            }



        }


    }

}
