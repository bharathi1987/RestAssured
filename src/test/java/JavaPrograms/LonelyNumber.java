package JavaPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        Set<Integer> setInt = new HashSet<Integer>();
int lonelyNumber=0;
for(Integer i:a)
{
    if(!setInt.contains(i))
    {
        setInt.add(i);
    }
    else
        setInt.remove(i);
}

for(Integer s:setInt)
    lonelyNumber=s;

        return lonelyNumber;
    }

}

public class LonelyNumber {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        int[] numbers = {84, 48, 13, 20, 61, 20, 33, 97, 34, 45, 6, 63, 71, 66, 24, 57, 92, 74, 6, 25, 51, 86, 48, 15, 64, 55, 77, 30, 56, 53, 37, 99, 9, 59, 57, 61, 30, 97, 50, 63, 59, 62, 39, 32, 34, 4, 96, 51, 8, 86, 10, 62, 16, 55, 81, 88, 71, 25, 27, 78, 79, 88, 92, 50, 16, 8, 67, 82, 67, 37, 84, 3, 33, 4, 78, 98, 39, 64, 98, 94, 24, 82, 45, 3, 53, 74, 96, 9, 10, 94, 13, 79, 15, 27, 56, 66, 32, 81, 77};

        // Add numbers to the ArrayList
        for (int num : numbers) {
            a.add(num);
        }


        System.out.println( Result.lonelyinteger(a));

    }
}