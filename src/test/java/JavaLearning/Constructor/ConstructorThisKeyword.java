package JavaLearning.Constructor;

public class ConstructorThisKeyword {

    String name;

    ConstructorThisKeyword()
    {
        this.name="Bharathi";
    }

    ConstructorThisKeyword(String name)
    {
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructorThisKeyword constructorThisKeyword=new ConstructorThisKeyword();
        ConstructorThisKeyword constructorThisKeyword1=new ConstructorThisKeyword("Aatheesh");

        System.out.println(constructorThisKeyword.name);
        System.out.println(constructorThisKeyword1.name);

    }
}
