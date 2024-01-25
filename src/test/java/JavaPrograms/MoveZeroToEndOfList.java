package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndOfList {

    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();

        numbers.add(0);
        numbers.add(7);
        numbers.add(8);
        numbers.add(0);
        numbers.add(6);

        for(int i=numbers.size()-1;i>=0;i--)
        {
            System.out.print(numbers.get(i).toString());
            System.out.print(" ");
        }

    }
}
