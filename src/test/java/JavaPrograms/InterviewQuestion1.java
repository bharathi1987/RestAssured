package JavaPrograms;

 class class1
{
    public static void main(String[] args) {

        InterviewQuestion1 interviewQuestion1=new InterviewQuestion1();

        System.out.println( interviewQuestion1.add(5,10));
        System.out.println(interviewQuestion1.add(5,6,7));
    }
}


public class InterviewQuestion1 {

    public int add(int ... s)
    {
       int sum=0;

       for(int i:s)
       {
           sum=sum+i;
       }
        return sum;
    }
}

