package JavaPrograms;

import java.util.Arrays;

public class SplitArrayIntoTwo {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        int pos=5;

        int b[]=new int[pos];//5

        int c[]=new int[a.length-pos]; //9-5


        for (int i=0;i<pos;i++) {

            if (i<pos) {
                b[i] = a[i];
            }
        }


        for (int i = 0; i < a.length - pos; i++) {
            c[i] = a[i + pos];
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

    }
}
