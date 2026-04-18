package com.example.utils;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiClient {

    private RequestSpecification request;

    public ApiClient() {
        // Base URI for the API
        RestAssured.baseURI = "https://api.example.com";
        request = RestAssured.given();
    }
    
    public RequestSpecification getRequest() {
        return request;
    }
}