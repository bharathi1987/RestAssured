package JavaLearning.test;//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        HashMap<String,Integer> hm=new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            hm.put(name,phone);
        }
        while(in.hasNext()) {
            String s = in.next();

            if (hm.containsKey(s)) {
                System.out.println(s + "=" + hm.get(s));

            } else {
                System.out.println("Not Found");

            }
        }
    }
}