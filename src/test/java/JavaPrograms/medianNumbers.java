package JavaPrograms;

import io.cucumber.java.bs.A;
import io.cucumber.java.sl.In;

import java.util.*;

public class medianNumbers {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();

        int temp;

        arr.add(6);
        arr.add(8);
        arr.add(4);
        arr.add(9);
        arr.add(0);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

    }
}
