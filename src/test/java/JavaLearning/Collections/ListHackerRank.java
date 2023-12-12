package JavaLearning.Collections;

import java.io.*;
import java.util.*;

public class ListHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i=0; i<n;i++)
        {
            arrayList.add(sc.nextInt());
        }
        //   System.out.println(arrayList);

        int numberOfActions=sc.nextInt();

        //   System.out.println(numberOfActions);

        for(int i=0;i< numberOfActions;i++)
        {
            String action=sc.next();
            // System.out.println(action);
            if(action.equalsIgnoreCase("Insert"))
            {
                int index=sc.nextInt();
                int value=sc.nextInt();
                arrayList.add(index,value);

            }

            if(action.equalsIgnoreCase("Delete"))
            {
                int value=sc.nextInt();
                arrayList.remove(value);
            }
        }


        for (int i=0;i< arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }

    }

}