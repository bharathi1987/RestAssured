package JavaLearning.Collections;

import java.util.*;

public class JavaMapsDemo {

    public static void main(String args[])
    {

        HashMap<String, String> schoolDetails= new HashMap<String, String>();
        TreeMap<String, String> schoolDetails1= new TreeMap<String, String>(Comparator.reverseOrder());
        TreeSet<String> treeSet =new TreeSet<String>();

//schoolDetails1.put(null,"bharathi");
        Iterator iterator1=schoolDetails1.entrySet().iterator();
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        schoolDetails.put("1","Bharathi");
        schoolDetails.put("2","Aatheesh");
        schoolDetails.put("3","Mohan");
        schoolDetails.put("4","Varshu");

        Iterator iterator=schoolDetails.entrySet().iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for(Map.Entry<String, String> entry : schoolDetails.entrySet()){
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(),
                    entry.getValue());

            if(entry.getKey().equalsIgnoreCase("4"))
            {
                System.out.println("Key Value"+ entry.getValue());
            }
        }

        System.out.println(schoolDetails.entrySet());

    }
}
