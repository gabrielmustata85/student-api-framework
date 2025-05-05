package com.example.studentapiframework;

import com.example.studentapiframework.testng.TestListeners;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Listeners;

@SpringBootTest
@Listeners(TestListeners.class)
public class BaseTest {

}
