package JavaLearning.Collections;

import java.util.ArrayList;

public class ArrayListNulldemo {

 /*   public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add(0, "A");
        list.add(2, "B");
        list.add(1, "C");

        System.out.println(list);

        //output ==== [A, C, null, B]
    }
*/
/*
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add(1, null);
        list.add(1, null);
        list.add(1, null);
        System.out.println(list);
    }
    //output === [null, null, null, null]
*/

/*    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add(2, null);
        list.add(1, null);
        list.add(1, null);
        System.out.println(list);
    }
    */

    //output == Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 1
    //	at java.util.ArrayList.rangeCheckForAdd(ArrayList.java:667)
    //	at java.util.ArrayList.add(ArrayList.java:479)
    //	at JavaLearning.Collections.ArrayListNulldemo.main(ArrayListNulldemo.java:35)



    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add(0, "A");
        list.add(1, "B");
        list.add(3, "C");
        list.add(2, "D");

        System.out.println(list);

        //output ==== [A, C, null, B]
    }
}
