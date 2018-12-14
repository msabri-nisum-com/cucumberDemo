package com.nisum.cucumberDemo.steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RestDefination {

    public RestDefination() {
        RestAssured.baseURI = RestConfiguration.OPEN_NOTIFY_API_URI;
    }

    public void requestProducts() {
        Response response =
                given().
                        contentType("text/plain").
                        when().
                        get("/products/").
                        then().
                        statusCode(200).
                        extract().response();
    }

    public void validateProductsContents() {
        Response response =
                given().
                        contentType("text/plain").
                        when().
                        get("/products/").
                        then().
                        body(containsString("Pants")).
                        extract().response();
    }
}
