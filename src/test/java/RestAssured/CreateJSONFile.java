package RestAssured;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {

    public static void main(String[] args) {

       JSONArray jsonArray=new JSONArray();

        JSONObject jsonObject=new JSONObject();

       jsonObject.put("Name","Bharathi");
       jsonObject.put("Age","35");

        jsonObject.put("arrar",jsonArray);
        System.out.println(jsonObject);


    }
}
