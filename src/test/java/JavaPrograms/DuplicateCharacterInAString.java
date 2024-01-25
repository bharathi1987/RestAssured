package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInAString {
    public static void main(String[] args) {

        String originalString1="My Name Is Bharathi";
        String originalString=originalString1.replaceAll("\\s+","");

        Map<Character,Integer> storingMap= new HashMap<Character,Integer>();

        for(char c:originalString.toCharArray())
        {
            if(storingMap.containsKey(c))
            {
                storingMap.put(c,storingMap.get(c)+1);
            }

            else
                storingMap.put(c,1);
        }

        for (Map.Entry<Character, Integer> entry :
                storingMap.entrySet())        {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }

        }
    }
}
