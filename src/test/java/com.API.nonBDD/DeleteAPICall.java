package com.API.nonBDD;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteAPICall {

   // @Test
    public void deleteAPIRequest() {
        RestAssured.baseURI = "https://reqres.in/";

        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.request(Method.DELETE, "api/users/32");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusLine());
    }
}
