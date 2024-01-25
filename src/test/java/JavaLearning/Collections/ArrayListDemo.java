package JavaLearning.Collections;

import io.cucumber.java.bs.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

    public  static void main(String args[])
    {

        ArrayListDemo arrayListDemo=new ArrayListDemo();
        ArrayList<String> colours=new ArrayList();
        ArrayList<Integer> colours1=new ArrayList();
        colours1.add(1);

        colours.add("red");
        colours.add("blue");
        colours.add("green");
        colours.add("brown");
        colours.add("yellow");
        colours.add("pink");
        colours.add(0,"purple");
        colours.add("");
        colours.add(null);

        System.out.println(colours.get(0));

        System.out.println(colours.size());


        // the below code will not yield desired results.
       /* for(int i=0;i< colours.size();i++)
        {
            colours.remove(i);
            System.out.println(colours.get(i));
        }
*/
        for (String color:colours) {
            System.out.println(color);
        }

        for (int i=0;i<colours.size();i++)
        {
            System.out.println("For Loop=============="+colours.get(i));
        }

        Iterator iterator= colours.iterator();
        while(iterator.hasNext())
            System.out.println("Iterator === "+iterator.next());

        ListIterator listIterator=colours.listIterator();

        while(listIterator.hasNext())
        {
            System.out.println("listIteratornext === "+listIterator.next());

        }

        while(listIterator.hasPrevious())
        {
            System.out.println("listIteratorPrevious === "+listIterator.previous());

        }
    }
}
