package com.yuze.springboot.playground_REST_CRUD_APIs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
-To create a service to return a list of students
-jackson handles the json to pojo conversions
-jackson is auto included in spring
-jackson calls getter setter in the conversions

 */
@SpringBootApplication
public class PlaygroundRestCrudApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundRestCrudApIsApplication.class, args);
	}

}
