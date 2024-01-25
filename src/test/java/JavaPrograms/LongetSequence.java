package JavaPrograms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongetSequence {


    public static void main(String[] args) {

        String test="test tesihbm aaaaa aaaaad trewqerty sgsdg";
        String size;
        Set<Character> largeSetArray = new HashSet<Character>();

        String[] listArray=test.split(" ");

        for(int i=0;i<listArray.length;i++)
        {
            char[] charArray=listArray[i].toCharArray();
            System.out.println(charArray.length);

            Set<Character> setInt = new HashSet<Character>();
            for(char c:charArray)
            {
                if(!setInt.contains(c))
                {
                    setInt.add(c);
                }

            }

        if(largeSetArray.size()<setInt.size())
        {
            System.out.println(largeSetArray);
            System.out.println(setInt);

            largeSetArray=setInt;

        }

    }

        System.out.println("largeArray"+largeSetArray.size());

    }
}
