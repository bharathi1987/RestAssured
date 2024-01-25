package JavaLearning.Inheritance;

import io.cucumber.java.an.E;

import java.io.IOException;

public class InheritanceChildClass extends  InheritanceParentClass{

    public void test() throws Exception {
        System.out.println("Child class 1");
    throw new Exception();}

    public void test(String test) {
        System.out.println("child class");
        System.out.println(test);}

    public static void main(String[] args) throws Exception {
        InheritanceParentClass inheritanceChildClass=new InheritanceChildClass();
        inheritanceChildClass.test();
    }
}
