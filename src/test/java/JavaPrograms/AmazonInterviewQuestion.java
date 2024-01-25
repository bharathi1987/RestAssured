package JavaPrograms;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AmazonInterviewQuestion {


    static int sumAList=0;
    static int tempList=0;
    public static void main(String[] args) {
        AmazonInterviewQuestion amazonInterviewQuestion = new AmazonInterviewQuestion();

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(5);
            arrayList.add(10);
        arrayList.add(7);
        arrayList.add(2);
        Collections.sort(arrayList);
  //Separating highest 2 elements in array into separate array

        List<Integer> setA = new ArrayList<>();
        List<Integer> setB = new ArrayList<>();
        List<Integer> setC = new ArrayList<>();

            int noOfElementsToBeAddedInSetA=2;
            setA = arrayList.subList(arrayList.size()-2, arrayList.size());
        setB = arrayList.subList(arrayList.size()- arrayList.size(), arrayList.size()-2);

        System.out.println(arrayList);

            List<Integer> arrayList1 = new ArrayList<>(arrayList);

            sumAList = amazonInterviewQuestion.sumOfArrayList(setA);
            tempList = amazonInterviewQuestion.sumOfArrayList(arrayList1);

            tempList = tempList - sumAList;
        System.out.println("SetA"+setA);
            while(sumAList<tempList)
            {
                noOfElementsToBeAddedInSetA++;

                System.out.println("noOfElementsToBeAddedInSetA=="+noOfElementsToBeAddedInSetA);

                setA = arrayList.subList(arrayList.size()-noOfElementsToBeAddedInSetA, arrayList.size());
                setB = arrayList.subList(arrayList.size()- arrayList.size(), arrayList.size()-noOfElementsToBeAddedInSetA);

                List<Integer> arrayList2 = new ArrayList<>(arrayList);

                sumAList = amazonInterviewQuestion.sumOfArrayList(setA);
                tempList = amazonInterviewQuestion.sumOfArrayList(arrayList2);

                tempList = tempList - sumAList;
                System.out.println("SetA===="+setA);
                System.out.println("SetB===="+setB);




            }

        System.out.println("SetA===="+setA);
    }
    public int sumOfArrayList(List<Integer> arrayListSum) {

        int sumList = 0;
        for (int i = 0; i < arrayListSum.size(); i++) {
            sumList = sumList + arrayListSum.get(i);
        }

        return sumList;
    }

}
