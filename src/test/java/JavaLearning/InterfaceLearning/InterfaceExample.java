package JavaLearning.InterfaceLearning;

interface  sumOfNumbers
{

    String test = null;
    public void sum();

    default void test()
    {
        System.out.println("default methods");
    }
}


public class InterfaceExample implements sumOfNumbers {
    @Override
    public void sum() {
        System.out.println("Hided Implementation Details");
    }

    public static void main(String[] args) {
        InterfaceExample in=new InterfaceExample();
        in.sum();
        in.test();
    }
}
