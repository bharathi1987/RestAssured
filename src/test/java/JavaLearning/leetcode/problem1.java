package JavaLearning.leetcode;

import java.util.Locale;

public class problem1 {

    public static void main(String[] args) {
        problem1 problemTest=new problem1();

        int n= problemTest.countKeyChanges("AaAaAaaA");
        System.out.println(n);

    }

    public int countKeyChanges(String s) {

        String s1=s.toLowerCase();
        int count=0;
        char[] newString= s1.toCharArray();

        for( int i=0;i< newString.length-1;i++) {

                if (newString[i]!=newString[i+1]) {
                    count++;



            }
        }

        return count;
    }

    }
