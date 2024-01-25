package JavaLearning.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.JAXBException;

public class ExceptionHandlingPractise {


       /* public static void main(String[] args) {
            try {
                testExceptions();
            } catch (NullPointerException | IOException e) {

                e.printStackTrace();
            }
            catch(JAXBException e){
                e.printStackTrace();
            }

        }



        public static void testExceptions() throws IOException, FileNotFoundException,JAXBException {

        }*/

/*
    public static void main(String[] args) {
        try {
            foo();
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }catch(Exception e){
            e = new Exception("");
            e.printStackTrace();
        }
    }

    public static void foo() throws IOException, JAXBException{

        int i =10/0;

    }*/


    public static void main(String args[]) {
        ExceptionHandlingPractise exceptionHandlingPractise = new ExceptionHandlingPractise();

        exceptionHandlingPractise.test();
    }

    public void test()
    {
        try
        {
            int i=10/0;
        }
        catch (Exception e)
        {
            System.out.println("Inside Catch block");
          //  throw e;
        }

        System.out.println("outside cath block");
    }


}
