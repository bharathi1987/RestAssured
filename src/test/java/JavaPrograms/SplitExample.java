package JavaPrograms;

public class SplitExample {
    public static void main(String[] args) {
        String str = "geek[ss@for@gee(ks)s";
        
        // Split the string using "@" as the delimiter with a limit of 2
        String[] arrOfStr = str.split("@", 3);

        // Display the result
        for (String part : arrOfStr) {
            System.out.println(part);
        }

        String[] arrOfStr1=str.split("[\\[@,()]+");

        for (String part : arrOfStr1) {
            System.out.println(part);
        }
    }
}