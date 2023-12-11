package JavaLearning.Collections;

import java.util.Set;
import java.util.TreeSet;


public class test{

    enum Day {
        MONDAY,TUESDAY,WEDNESDAY,SATURDAY,THURSDAY,FRIDAY,SUNDAY
    }
    public static void main (String args[]) {
        Set mySet = new TreeSet();
        mySet.add(Day.SATURDAY);
        mySet.add(Day.WEDNESDAY);
        mySet.add(Day.FRIDAY);
        mySet.add(Day.WEDNESDAY);
        for(Object d: mySet){
            System.out.println(d);
        }


}
}