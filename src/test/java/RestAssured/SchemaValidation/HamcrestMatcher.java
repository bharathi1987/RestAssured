package RestAssured.SchemaValidation;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HamcrestMatcher {

    public static void main(String[] args) throws IOException {

        //File inputFileJson=new File("src/test/resources/Files/file.json");

       // String inputJsonContent= FileUtils.readFileToString(inputFileJson,"UTF-8");

        String inputJsonContent= new String(Files.readAllBytes(Paths.get("src/test/resources/Files/file.json")));

        File schemaJson=new File("src/test/resources/Files/schema1.json");

        MatcherAssert.assertThat(inputJsonContent, JsonSchemaValidator.matchesJsonSchema(schemaJson));

    }
}
