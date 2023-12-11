package JavaLearning.Exceptions;

import org.testng.annotations.Test;

public class ExceptionHandlingLearning {

    @Test
    public void ExceptionHadlingUseCase1()
    {
        try
        {
            System.out.println("In try Block");

            throw new Exception();

          //  System.out.println("In try Block"); -- Gives compliation error due to unreachable code

        }

        catch (Exception e)
        {
            System.out.println("In Catch Block");

        }
    }
}
