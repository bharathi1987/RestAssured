package JavaLearning.Constructor;



    // Java program to illustrate Constructor Chaining
// within same class Using this() keyword
    class ContructorChainingExam
    {
        // default constructor 1
        // default constructor will call another constructor
        // using this keyword from same class
        ContructorChainingExam()
        {
            // calls constructor 2
            this(5);
            System.out.println("The Default constructor");
        }

        // parameterized constructor 2
        ContructorChainingExam(int x)
        {
            // calls constructor 3
            this(7, 15);
            System.out.println(x);
        }

        // parameterized constructor 3
        ContructorChainingExam(int x, int y)
        {
            System.out.println(x * y);
        }

        public static void main(String args[])
        {
            // invokes default constructor first
            new ContructorChainingExam();
        }
    }

