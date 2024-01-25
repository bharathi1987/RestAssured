package JavaLearning.Exceptions;

// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes
import java.io.*;

// Main class
public class FilenotFoundException {

    // main driver method
    public static void main(String[] args) throws Exception {

        FilenotFoundException filenotFoundException=new FilenotFoundException();
        filenotFoundException.method2();

    }
        public void method1() throws Exception
        {
            // File path is passed as parameter
            File file = new File(
                    "C:\\Users\\pankaj\\Desktop\\test.txt");

            // Note: Double backquote is to avoid compiler
            // interpret words
            // like \test as \t (ie. as a escape sequence)

            // Creating an object of BufferedReader class
            BufferedReader br
                    = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while (true)

                // Print the string
            {
                try {
                    if (!((st = br.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(st);

        }

        public void method2() throws Exception {
            FilenotFoundException filenotFoundException=new FilenotFoundException();
            filenotFoundException.method1();
        }

}
