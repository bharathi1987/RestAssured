package JavaLearning.Inheritance;

import java.io.FileNotFoundException;

class A
{
    public void test() throws Exception {

    }

}

class B extends A
{

    @Override
    public void test() throws Exception {


    }

    public static void main(String[] args) {

        A a =new B();



    }
}