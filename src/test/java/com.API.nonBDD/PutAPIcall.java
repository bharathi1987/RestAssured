package com.API.nonBDD;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PutAPIcall {

    @Test
    public void putAPIcall()
    {
        RestAssured.baseURI="https://reqres.in/";
       // RestAssured.baseURI="https://reqres.in/api/users/32"; - Another type of giving base URI

        RequestSpecification requestSpecification= RestAssured.given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident1\"\n" +
                        "}");
        Response response = requestSpecification.request(Method.PUT,"/api/users/32");
        //Response response = requestSpecification.request(Method.PUT); - Another type of giving base URI

        System.out.println(response.getStatusLine());

        System.out.println(response.asPrettyString());



    }
}
