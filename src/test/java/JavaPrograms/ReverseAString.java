package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

    public static void main(String[] args) {

        //Method 1 - take char from last and insert into string one by one

        String originalString="Bharathi is Good";

        String reverseString="";

        for(int i=originalString.length()-1;i>=0;i--)
        {
            reverseString=reverseString+originalString.charAt(i);
        }

        System.out.println("Method1"+reverseString);



        String reverseString1="";
        for(int i=0;i<originalString.length();i++)
        {
            reverseString1=originalString.charAt(i)+reverseString1;
        }
        System.out.println("Method2"+reverseString1);



        String inputString="Mohan is Bad";

        char [] inputStringArray=inputString.toCharArray();

        for(int i=inputStringArray.length-1;i>=0;i--)

        {
            System.out.print("Method3"+inputStringArray[i]);
        }


        // using array list collections.reverse

        String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());

// Using String builder
        String input2 = "Geeks For Geeks";
StringBuilder sB=new StringBuilder();
sB.append(input2);
        sB.reverse();
        System.out.println("StringBuilder"+sB);



    }
}
