package com.testingdemo.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestProject1Application {

	public static void main(String[] args) {
		SpringApplication.from(Project1Application::main).with(TestProject1Application.class).run(args);
	}

}
