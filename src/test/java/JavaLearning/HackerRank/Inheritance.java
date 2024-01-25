package JavaLearning.HackerRank;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}



class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    Student(String firstName, String lastName, int identification,int[] testScores )
    {
        super(firstName,lastName,identification);
        this.testScores=testScores;

    }

    public String  calculate()
    {
        String Grade=null;
        int averageMarks=0;

        for(int i=0;i<testScores.length;i++)
        {
            averageMarks=averageMarks+testScores[i];
        }

        averageMarks=averageMarks/testScores.length;

        if(averageMarks>=90 && averageMarks<=100)
            Grade="O";
        if(averageMarks>=80 && averageMarks<90)
            Grade="E";
        if(averageMarks>=70 && averageMarks<80)
            Grade="A";
        if(averageMarks>=55 && averageMarks<70)
            Grade="P";
        if(averageMarks>=40 && averageMarks<55)
            Grade="D";
        if(averageMarks<40)
            Grade="T";

        return Grade;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}