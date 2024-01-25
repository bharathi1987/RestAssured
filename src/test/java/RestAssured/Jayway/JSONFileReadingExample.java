package RestAssured.Jayway;

import com.jayway.jsonpath.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JSONFileReadingExample {

    public static void main(String[] args) throws IOException {

        //1 read the file
        //parse in the file

        String jsonContent = new String(Files.readAllBytes(Paths.get("src/test/resources/Files/file.json")));

        String name= JsonPath.read(jsonContent,"$.name");

        System.out.println(name);

        List<String> hobbies = JsonPath.read(jsonContent, "$.hobbies[*]");
        System.out.println("Hobbies: " + hobbies);


    }
}
