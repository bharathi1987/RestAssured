package RestAssured;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetails {

    public static void main(String[] args) throws JsonProcessingException {

        EmployeeDetails employeeDetails = new EmployeeDetails();
        SimplePojoclass simplePojoclass = new SimplePojoclass();

        simplePojoclass.setName("Bharathi");
        simplePojoclass.setAge(35);

        simplePojoclass.getName();
        simplePojoclass.getAge();

        ObjectMapper objectMapper = new ObjectMapper();

        String employeeJson = objectMapper.writeValueAsString(simplePojoclass);

        System.out.println(employeeJson);

        try {
            FileWriter fileWriter = new FileWriter("src/test/resources/Files/test.json");
            fileWriter.write(employeeJson);

            fileWriter.close();
            objectMapper.writeValue(new File("src/test/resources/Files/elements.json"), simplePojoclass);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
