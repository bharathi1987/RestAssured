package com.API.BDD;

import io.restassured.RestAssured;
//import org.testng.annotations.Test;

import java.io.File;

public class ExternalJSONFile {

   // @Test
    public void postAPIWithExternalJSONFile()
    {

        File jsonFile=new File(System.getProperty("user.dir")+"/src/main/resources/Files/postFile1.json");

        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body(jsonFile)
                .when()
                .post("api/users")
                .prettyPrint();

        System.out.println("FileContent============"+jsonFile.toString());
    }
}
