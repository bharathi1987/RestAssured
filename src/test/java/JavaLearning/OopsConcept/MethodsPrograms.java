package JavaLearning.OopsConcept;

public class MethodsPrograms {

    static int i=10;

    public static void method1()
    {

        i=20;
        System.out.println("inside method 1");
        System.out.println(i);
    }
    public int method2()
    {

        i=21;
        method1();
        System.out.println("inside method 2");
        return 1;
    }

    private void test(int i)
    {

    }

    public void test(int i, int j)
    {

    }

    public static void main(String[] args) {
        method1();

        MethodsPrograms methodsPrograms=new MethodsPrograms();
        methodsPrograms.method2();
        methodsPrograms.method1();
        int j=methodsPrograms.method2();
        System.out.println("J=="+j);
    }
}
