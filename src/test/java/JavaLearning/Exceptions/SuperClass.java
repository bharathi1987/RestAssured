package JavaLearning.Exceptions;

import java.io.IOException;

class SuperClass {

    // SuperClass doesn't declare any exception
    void method() throws Exception{
        System.out.println("SuperClass");
    }
}

// SuperClass inherited by the SubClass
class SubClass extends SuperClass {

    // method() declaring Checked Exception IOException
    void method() throws Exception {

        // IOException is of type Checked Exception
        // so the compiler will give Error

        int i= 5/0;
        System.out.println("SubClass");
    }

    // Driver code
    public static void main(String args[]) throws Exception {
        SubClass s = new SubClass();
        s.method();
    }
}