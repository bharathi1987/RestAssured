package JavaLearning;

import java.util.*;

public class programs {

    public static void main(String[] args) {

        String s="345";
        int k= Integer.parseInt(s);
        System.out.println(k);

        String price1="$10000";
        System.out.println(price1.replaceAll("[$]",""));

        List<Integer> arrList= Arrays.asList(10,6,5,8,44);

        for(int i:arrList)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

       arrList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        Collections.sort(arrList);

        System.out.println(arrList);

        Map <String, String> hm= new HashMap<String,String>();

        hm.put("A","Test");
        hm.put("a","Test");
        hm.put("a","Test1");

        System.out.println(hm.get("a"));


    }
}
