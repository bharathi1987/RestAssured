package JavaLearning;

import io.cucumber.java.sl.In;

interface interface1
        {

            void methodInInterface1();

            default void test1()
            {
                System.out.println("test");
            }
        }

interface interface2
{
    public void methodInInterface2();

}

public class Interface implements interface1,interface2 {
    @Override
    public void methodInInterface1() {
        System.out.println("methodInInterface1");
    }

    @Override
    public void methodInInterface2() {
        System.out.println("methodInInterface2");

    }

    public static void main(String[] args) {

        Interface in = new Interface();
        in.methodInInterface1();
        in.methodInInterface2();
        in.test1();

    }
}
