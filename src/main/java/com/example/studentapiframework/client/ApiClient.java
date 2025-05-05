package com.example.studentapiframework.client;

import com.example.studentapiframework.util.JsonConfigReader;
import io.restassured.RestAssured;

import java.util.Map;

public class ApiClient {

    public static String get(String endpoint, int statusCode) {
        return RestAssured.given()
                .baseUri(JsonConfigReader.getConfig().baseUrl)
                .when()
                .get(endpoint)
                .then()
                .statusCode(statusCode)
                .log().all()
                .extract()
                .asString();
    }

    public static String getUsersWithToken(String endpoint, int statusCode, String token) {
        return RestAssured.given()
                .baseUri(JsonConfigReader.getConfig().baseUrl)
                .header("x-api-key", token)
                .when()
                .get(endpoint)
                .then()
                .statusCode(statusCode)
                .log().all()
                .extract()
                .asString();
    }
}
