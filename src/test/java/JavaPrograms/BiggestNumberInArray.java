package JavaPrograms;

public class BiggestNumberInArray {

    public static void main(String[] args) {

        int[] arrayNumber={1,3,5,2,7};

        int largestNumber=arrayNumber[0];

        for (int i=0;i<arrayNumber.length;i++)
        {
            if(largestNumber<arrayNumber[i])
            {
                largestNumber=arrayNumber[i];
            }
        }

        System.out.println(largestNumber);
    }

}
