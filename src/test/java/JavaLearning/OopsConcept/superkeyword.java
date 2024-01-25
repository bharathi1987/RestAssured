package JavaLearning.OopsConcept;

import java.io.FileNotFoundException;
import java.io.IOException;

class A
{

    public void test1() throws IOException
    {
        System.out.println("Parent class");
    }
}

class superkeyword extends A{

    public void test1() throws IOException
    {
        System.out.println("Chile class and invoking super");
        super.test1();


    }
    public static void main(String[] args) throws IOException {
        superkeyword SK= new superkeyword();
        SK.test1();
        A a=new A();
        a.test1();
    }
}


