package RestAssured.SchemaValidation;

import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

public class RestAssured {

    public static void main(String[] args) {

        File inputJson=new File("src/test/resources/Files/file.json");
        File schemaJson=new File("src/test/resources/Files/schema1.json");

        io.restassured.RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body(inputJson)
                .when()
                .post("api/users")
                .then()
               .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")); // Schema files to be in src/test/resources folder
             //   .body(JsonSchemaValidator.matchesJsonSchema(schemaJson));


//with class path -                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")); // Schema files to be in src/test/resources folder
//without class path -             //   .body(JsonSchemaValidator.matchesJsonSchema(schemaJson));
    }
}
