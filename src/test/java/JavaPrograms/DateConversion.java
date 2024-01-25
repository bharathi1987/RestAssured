package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

    public static void main(String[] args) {

        Date date=new Date("12-jan-2024");

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");

        System.out.println(dateFormat.format(date));
    }
}
