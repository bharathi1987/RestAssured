package JavaLearning.Exceptions;

public class ExceptionHandlingFinally {

    public static void main(String args[])
    {
        System.out.println("Before try Block");

        try
        {
            int i=10/0;

        }
      //  System.out.println("After try block"); -- No statement is allowed between try and catch blocks
   /*     catch (Exception e)
        {
            System.out.println("Inside Catch Block");
            e.printStackTrace();
        }*/
       // System.out.println("After catch Block"); -- No statement is allowed between try and finallay blocks

        finally {
            try
            {
                System.out.println("inside finally try Block");
                int i=10/0;

            }
            catch (Exception e)
            {
                System.out.println("Inside Catch Block");

            }
            System.out.println("Inside finally block");
        }
        System.out.println("After finally Block"); // this code will not execute only try and finally there. but compiler also will not throw error



    }
}
