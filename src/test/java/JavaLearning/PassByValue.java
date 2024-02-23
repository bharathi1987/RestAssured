package JavaLearning;

public class PassByValue {

int insVariable;

    public static void main(String[] args) {

        PassByValue passByValue=new PassByValue();
        passByValue.insVariable=2;


        System.out.println(passByValue.insVariable);
    }

    public static void passingValueInMethod(PassByValue passByValue1)
    {
        passByValue1.insVariable=12; // it looks like reference is passed but still reference is passed as a value
    }
}
