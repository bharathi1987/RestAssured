package JavaLearning.Constructor;

import java.io.IOException;

class ParentConstructorClasss
{
    ParentConstructorClasss() throws IOException
    {
        System.out.println("Parent constructor");
    }
}


public class ConstructorExample1 extends ParentConstructorClasss {

    String name;
    int rollNo;
    Integer studentCount;
    Float number;

     ConstructorExample1() throws Exception
    {

        name="Bharathi";
    }

    ConstructorExample1(String name1) throws Exception {
        super();
        name=name1;
    }
    public static void main(String[] args) throws Exception {

        ConstructorExample1 constructorExample1=new ConstructorExample1();
        System.out.println(constructorExample1.name);
        System.out.println(constructorExample1.rollNo);
        System.out.println(constructorExample1.studentCount);
        ConstructorExample1 constructorExample2=new ConstructorExample1("Aatheesh");
        System.out.println(constructorExample2.name);


    }
}
