package com.API.BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAPICall {

    @Test
    public void getAPICall()
    {

        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users")
                .prettyPrint();
    }

    @Test
    public void postAPICall()
    {

        Response response=RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post("api/users");

        System.out.println("Response=============="+response.getStatusLine());

    }

    @Test
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

    @Test
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
