package JavaPrograms;

import java.util.Arrays;

public class Amazon1 {

    public static void main(String[] args) {

        int [][] array2D= {{1,2,3},{3,2,1},{7,8,9}};
        System.out.println(Arrays.deepToString(array2D));

        for(int i=0;i<array2D.length;i++)
        {
            for (int j=0;j< array2D.length;j++)
            {

                    System.out.print(" "+ array2D[i][j]);


            }
        }




    }
}
