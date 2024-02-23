package JavaPrograms;

public class palindrom {
    public static void main(String[] args) {

        String original= "malayalamdd";

        String reversedString;

        StringBuilder sb=new StringBuilder();
        sb.append(original);
        sb.reverse();

        System.out.println(sb);

        if(original.equalsIgnoreCase(sb.toString()))
        {
            System.out.println("Palindrom");
        }
        else
            System.out.println("Not Palindrome");

    }
}
