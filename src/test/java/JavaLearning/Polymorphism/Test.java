package JavaLearning.Polymorphism;
class A {
    void m1(Object obj){
        System.out.println("One");
    }
}
class B extends A {
    void m1(Object obj){
        System.out.println("Two");
        super.m1(null);

    }
    void m2(Object obj){
        this.m1(null);

        System.out.println("Three");
    }
}
public class Test{
    public static void main(String[] args){
        A a = new B();
        a.m1(new A());

        B b = new B();
        b.m2(new B());
    }
}
