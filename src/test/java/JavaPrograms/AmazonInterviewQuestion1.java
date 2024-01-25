package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonInterviewQuestion1 {





    static int sumAList=0;
    static int tempList=0;
    public static void main(String[] args) {
        boolean intersectionRule=true;
        boolean unionRule=true;
        boolean sumRuleInA=true;
        boolean noOFElementsInA=true;

        AmazonInterviewQuestion1 amazonInterviewQuestion = new AmazonInterviewQuestion1();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> setA = new ArrayList<>();
        List<Integer> setB = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(2);
        Collections.sort(arrayList);

        //split array List

        while(intersectionRule && unionRule && sumRuleInA && noOFElementsInA)
        {


            int noOfElementsToBeAddedInSetA=2;
            setA = arrayList.subList(arrayList.size()-noOfElementsToBeAddedInSetA, arrayList.size());
            setB = arrayList.subList(0, arrayList.size()-noOfElementsToBeAddedInSetA);

        }

    }


    public int sumOfArrayList(List<Integer> arrayListSum) {

        int sumList = 0;
        for (int i = 0; i < arrayListSum.size(); i++) {
            sumList = sumList + arrayListSum.get(i);
        }

        return sumList;
    }

}
