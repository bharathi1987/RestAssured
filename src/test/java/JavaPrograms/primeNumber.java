package JavaPrograms;

public class primeNumber {

    public static void main(String[] args) {

        int n = 67;
        boolean flag = false;
        for (int j = 2; j <= 67; j++) {
            for (int i = 2; i <= j/2; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag)
                System.out.println(j + "===n is prime number");
            else
                System.out.println(j + "===n is not prime number");
        }

    }
}
