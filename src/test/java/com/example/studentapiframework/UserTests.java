package com.example.studentapiframework;

import org.testng.annotations.Test;

import static com.example.studentapiframework.client.getUsers.GetUser.*;
import static com.example.studentapiframework.client.getUsers.GetUser.userNotFound;

public class UserTests extends BaseTest {

    public static final String AUTH_TOKEN = "reqres-free-v1";

    @Test
    void e2eTest() {
        getUsers("/api/users?page=2", 200);
        getUser("/api/user/2", 200, AUTH_TOKEN);
        userNotFound("/api/user/23", 404, AUTH_TOKEN);
    }

    @Test
    void getListOfUsers() {
        getUsers("/api/users?page=2", 200);
    }

    @Test
    void getSingleUser() {
        getUser("/api/user/2", 200, AUTH_TOKEN);
    }

    @Test
    void getUserNotFound() {
        userNotFound("/api/user/23", 404, AUTH_TOKEN);
    }


}
