package RestAssured.Jayway;

import java.io.FileWriter;
import java.io.IOException;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class JsonFileCreationExample {
    public static void main(String[] args) {
        // Create a JSON object
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");
        JSONArray jsonArray=new JSONArray();
        jsonArray.add("Singing");
        jsonArray.add("dancing");
        jsonArray.add("ukelele");
        jsonObject.put("Hobbies",jsonArray);

        // Specify the file path where you want to save the JSON file
        String filePath = "src/test/resources/Files/file.json";

        // Write the JSON object to the file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(jsonObject.toJSONString());
            System.out.println("JSON file created successfully at: " + filePath);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error writing JSON to file: " + e.getMessage());
        }

    }
}
