package JavaLearning.Constructor;

public class ConstructorWithStaticBlock {

    static int i;
    int j;
    final int k;

    public static void main(String[] args) {
        ConstructorWithStaticBlock constructorWithStaticBlock=new ConstructorWithStaticBlock();
        System.out.println("Inside Main Block");
        System.out.println(i);
        System.out.println(constructorWithStaticBlock.k);

    }


    static
    {
        System.out.println("Inside Static block");
        i=10;

    }

    ConstructorWithStaticBlock()
    {
        i=106;
        j=11;


        System.out.println("Inside Constructor");
        System.out.println(i);
        k = 6;
    }

}
