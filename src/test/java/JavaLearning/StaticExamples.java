package JavaLearning;

public class StaticExamples {

    private int x = 10;
    static int m1() {
        StaticExamples sc3=new StaticExamples();

        int y = sc3.x;
        return y;
    }
    static int totalTicketsBooked;

    public void method1(int individualTickets)
    {
        totalTicketsBooked=totalTicketsBooked+individualTickets;
    }

    public void method2(int individualTickets)
    {
        totalTicketsBooked=totalTicketsBooked+individualTickets;
    }

    public static void main(String[] args) {
        StaticExamples sc1=new StaticExamples();
        StaticExamples sc2=new StaticExamples();

        sc1.method1(5);
        sc2.method2(6);

        System.out.println(totalTicketsBooked);



    }
}
