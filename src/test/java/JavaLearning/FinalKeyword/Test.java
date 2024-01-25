package JavaLearning.FinalKeyword;

public class Test extends Myclass {
    void m2() {
        System.out.println("Two");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m2();
    }
}
