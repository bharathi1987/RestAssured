package com.API.nonBDD;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetAPICall {

    @Test
    public void getAPICall()
    {
        RestAssured.baseURI="https://reqres.in/";

        RequestSpecification requestSpecification=RestAssured.given();

       Response response= requestSpecification.request(Method.GET,"api/users");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusLine());

    }
}
