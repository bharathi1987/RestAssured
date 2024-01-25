package RestAssured;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JaywayJsonPathReader {

    public static void main(String[] args) throws IOException {


        File jsonFile= new File("src/test/resources/Files/jsonFileJayway.json");

       List<Object> list= JsonPath.read(jsonFile,"$.phoneNumber[0:1].type");
       // List<Object> list= JsonPath.read(jsonFile,"$.phoneNumber[0].type"); - can be written like this also
        List<Object> list1= JsonPath.read(jsonFile,"$..type"); // Deep Scan - it will get type irrespective of any parent.

       for( Object listOuput: list)
       {
           System.out.println(listOuput);
       }
        for( Object listOuput: list1)
        {
            System.out.println(listOuput);
        }


    }
}


/*
<dependency>
<groupId>com.jayway.jsonpath</groupId>
<artifactId>json-path</artifactId>
<version>2.4.0</version>
</dependency>
*/
