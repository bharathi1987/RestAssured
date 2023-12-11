package JavaLearning.Exceptions;

public class ExceptionPropogation {

    public static void main(String args[])
    {
        ExceptionPropogation exceptionPropogation=new ExceptionPropogation();

        try
        {
            exceptionPropogation.method1();
           // exceptionPropogation.method2();
        }

        catch (Exception e)
        {
            System.out.println("main Method");
        }
    }

    public void method1()
    {
        try
        {
            int n= 5/0;
        }

        catch (Exception e)
        {
            System.out.println(" Inside Method1");
        }
        System.out.println("Test");

    }

    public void method2()
    {
        int n= 5/0;

    }
}
