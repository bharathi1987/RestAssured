package JavaLearning;

//import org.testng.annotations.Test;

public class JavaLearning {

    public void SwitchStatement()
    {
        int a=11;

        switch (a)
        {
            case 10:
                System.out.println("test");
            default:
                System.out.println("Default");
            case 11:
                System.out.println("test11");
            case 12:
                System.out.println("test3444");
        }
    }

    public void SwitchStatement1()
    {
        int a=11;

        switch (a)
        {
            case 10:
                System.out.println("test");
            case 11:
                System.out.println("test11");
            case 12:
                System.out.println("test3444");
            default:
                System.out.println("Default");
        }
    }
/*
    @Test
    public void SwitchStatement2()
    {
        String a="Test";

        switch (a)
        {
            case 10: // compliation error as we cannot use different data types
                System.out.println("test");
            case 11:
                System.out.println("test11");
            case 12:
                System.out.println("test3444");
            default:
                System.out.println("Default");
        }
    }*/


   // @Test
    public void SwitchStatement3()
    {
        int a=11;
        final int b=11;

        switch (b)
        {

            case b:
            case 10:
                System.out.println("test11");
                break;
            case 12:
                System.out.println("test3444");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    // Final Variable case
   /* @Test
    public void SwitchStatement5(final int methodVariable)
    {
        int a=11;
         int b=11;

        switch (a)
        {

            case b: // Compilation error as it is not declared as  final.
                // bcos local variables are not considered as the values will be changing
            case 10:
                System.out.println("test11");
                break;
            case methodVariable: // we do use final variable but came as method argument.
                // hence the value can be changed and cannot be used
                System.out.println("test3444");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
*/
}
