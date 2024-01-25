package JavaLearning.Collections;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

  //  @Test
    public void setDemo1()
    {
        HashSet hashSet =new HashSet();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("B");
        hashSet.add(null);
        System.out.println(hashSet);

        hashSet.remove("A");
        System.out.println(hashSet);

        hashSet.clear();
        System.out.println(hashSet);

   }

  // @Test
    public void treeSetDemo()
   {
       TreeSet<String> mySet = new TreeSet<String>();
       mySet.add("1");
       mySet.add("2");
       mySet.add("111");
       for(String d: mySet){
           System.out.println(d);
       }
   }
   // @Test
    public void treeSetDemo1()
    {
        TreeSet<Integer> mySet = new TreeSet<Integer>();
        mySet.add(1);
        mySet.add(111);
        mySet.add(3);
        for(int d: mySet){
            System.out.println(d);
        }
    }
//output === 1 3 111



    //Enum
/*
    public class test{

        enum Day {
            MONDAY,TUESDAY,WEDNESDAY,SATURDAY,THURSDAY,FRIDAY,SUNDAY
        }
        public static void main (String args[]) {
            Set mySet = new TreeSet();
            mySet.add(JavaLearning.Collections.test.Day.SATURDAY);
            mySet.add(JavaLearning.Collections.test.Day.WEDNESDAY);
            mySet.add(JavaLearning.Collections.test.Day.FRIDAY);
            mySet.add(JavaLearning.Collections.test.Day.WEDNESDAY);
            for(Object d: mySet){
                System.out.println(d);
            }


        }
    }*/



}
