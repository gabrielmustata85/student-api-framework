package com.example.studentapiframework.client.getUsers;

import com.example.studentapiframework.client.ApiClient;

public class GetUser {

    public static String getUsers(String path, int statusCode) {
        return ApiClient.get(path, statusCode);
    }

    public static String getUser(String path, int statusCode, String token) {
        return ApiClient.getUsersWithToken(path, statusCode, token);
    }

    public static String userNotFound(String path, int statusCode, String token) {
        return ApiClient.getUsersWithToken(path, statusCode, token);
    }
}
