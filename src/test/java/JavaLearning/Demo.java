package JavaLearning;


class A
{

    static void m1()
    {
        A a=new A();
        a.m2();
    }

    void m2()
    {

    }
}

class B
{
    public static void main(String[] args) {

        A.m1();

    }
}