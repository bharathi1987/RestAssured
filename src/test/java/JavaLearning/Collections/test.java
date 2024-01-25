package JavaLearning.Collections;

import java.util.*;


public class test{


    public static void main (String args[]) {

// using sorting function
        int[] arr={4,3,2,5,1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //using loops

        int[] arr1={4,3,2,5,1,5,7};

        int temp;

        for (int i=0;i< arr1.length;i++)
        {
            for (int j=i+1;j< arr1.length;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));


        //Arrylist Duplicate removal

    }
}