package com.API.nonBDD;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import org.testng.annotations.Test;

public class PostAPICall {

    //@Test
    public void postAPICall()
    {
        RestAssured.baseURI="https://reqres.in/";

        RequestSpecification requestSpecification=RestAssured.given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}");

        Response response=requestSpecification.request(Method.POST,"api/users");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusLine());

    }
}
