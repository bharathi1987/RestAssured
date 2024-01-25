/*
package utilities;

import io.restassured.path.json.JsonPath;
import org.json.simple.parser.JSONParser;

public class JsonUtility {

    String jsonMessage="{\n" +
            "  \"pageInfo\": {\n" +
            "    \"pageName\": \"abc\",\n" +
            "    \"pagePic\": \"http://example.com/content.jpg\"\n" +
            "  },\n" +
            "  \"posts\": [\n" +
            "    {\n" +
            "      \"post_id\": \"123456789012_123456789012\",\n" +
            "      \"actor_id\": \"1234567890\",\n" +
            "      \"picOfPersonWhoPosted\": \"http://example.com/photo.jpg\",\n" +
            "      \"nameOfPersonWhoPosted\": \"Jane Doe\",\n" +
            "      \"message\": \"Sounds cool. Can't wait to see it!\",\n" +
            "      \"likesCount\": \"2\",\n" +
            "      \"comments\": [],\n" +
            "      \"timeOfPost\": \"1234567890\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static void main(String arge[]) throws Exception {
        JsonUtility jsonUtility=new JsonUtility();

        jsonUtility.parseJSON();
    }

    public void parseJSON() throws Exception
    {
        // Read the JSON File

        //File f1= new File(System.getProperty("user.dir")+"jsonMessage");

      //  String fileContent=new Scanner(f1).useDelimiter("\\Z").next();
        String fileContent=jsonMessage;

        JsonPath jsonRecord=new JsonPath(fileContent);

        JSONParser parser=new JSONParser();

        String test=jsonRecord.get("pageInfo.pageName");
        System.out.println(test);


    }





}
*/
