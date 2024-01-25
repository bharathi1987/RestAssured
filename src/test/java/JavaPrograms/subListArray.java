package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subListArray {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);


        System.out.println(arrayList);

        System.out.println(arrayList.size());

arrayList =arrayList.subList(arrayList.size()-2, arrayList.size());
    System.out.println(arrayList);

    }
}
