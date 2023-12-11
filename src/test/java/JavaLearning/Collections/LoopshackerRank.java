package JavaLearning.Collections;

import java.util.Scanner;

public class LoopshackerRank {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int temp=0;
                for ( int j=0;j<n;j++)
                {
                    int powvalue= (int)Math.pow(2, j);
                    int temp1=powvalue*b;
                    if(j==0)
                        temp=temp+a+temp1;
                    else
                        temp=temp+temp1;
                    System.out.print(temp+" ");
                }
                System.out.println();
            }
            in.close();
        }

}
