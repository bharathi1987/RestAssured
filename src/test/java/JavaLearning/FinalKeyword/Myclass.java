package JavaLearning.FinalKeyword;

import java.util.ArrayList;
import java.util.List;
/*

class FinalKeywordUseCase01{
    private final int x = 10;
    void m1()
    {
         int x = 20;
        System.out.println(x);
    }
    public static void main(String[] args) {
        FinalKeywordUseCase01 obj = new FinalKeywordUseCase01();
        obj.m1();
        System.out.println(obj.x);

        final List<Integer> obj1 = new ArrayList<>();
        obj1.add(24);
        obj1.add(10);
        obj1 = new ArrayList<>();
        System.out.println(obj1);
    }
}  */


public class Myclass
{
    final void m1() {
        System.out.println("One");
    }
}
