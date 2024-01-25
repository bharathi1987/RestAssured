package com.API.BDD;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
//mport org.testng.annotations.Test;

public class GetAPICall {


    public void getAPICall()
    {

        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users")
                .prettyPrint();
    }

    public void postAPICall()
    {

        Response response= (Response) RestAssured
                .given()
                .auth().basic("","")
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post("api/users")
                        .then()
                                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""));

        System.out.println("Response=============="+response.getStatusLine());


    }

    public void putRequest()
    {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .put("api/users/30")
                .getStatusLine();
    }

    public void deleteRequest()
    {
        Response response=RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .when()
                .delete("api/users/10");

        System.out.println("Response==========="+response.prettyPrint());
    }
}
