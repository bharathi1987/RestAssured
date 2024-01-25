package JavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Amazon2 {

    public static void main(String[] args) {

        int temp=0;
        int maxSum=0;
        String iValue = null;
        String jValue=null;
        List<Integer> array=new ArrayList<Integer>();

        array.add(3);
        array.add(3);
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(5);
        array.add(1);

        List<String> stringArray1=new ArrayList<String>();

        for(int k=0;k< array.size();k++) {
            stringArray1.add(String.valueOf(array.get(k)));
        }

        while( stringArray1.size()>1) {
            int sumOfArray=0;
            maxSum=0;
            for (int i = 0; i < stringArray1.size(); i++) {
                for (int j = i + 1; j < stringArray1.size(); j++) {
                    if (stringArray1.get(i).equalsIgnoreCase(stringArray1.get(j))) {
                    }
                    else
                    {
                         sumOfArray = Integer.parseInt(stringArray1.get(i)) + Integer.parseInt(stringArray1.get(j));

                        System.out.println(sumOfArray);
                        if (maxSum < sumOfArray) {
                            maxSum = sumOfArray;
                            iValue = stringArray1.get(i);
                            jValue = stringArray1.get(j);

                        }


                    }
                }
            }

            ListIterator LI = stringArray1.listIterator();

            while (LI.hasNext()) {
                if (LI.next().equals(iValue)) {
                    LI.remove();
                    break;
                }
            }

            ListIterator LI1 = stringArray1.listIterator();

            while (LI1.hasNext()) {
                if (LI1.next().equals(jValue)) {
                    LI1.remove();
                    break;
                }
            }
            System.out.println(stringArray1);

        }
        System.out.println(stringArray1);
    }
}
