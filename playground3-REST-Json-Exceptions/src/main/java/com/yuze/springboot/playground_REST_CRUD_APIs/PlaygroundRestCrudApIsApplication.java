package com.yuze.springboot.playground_REST_CRUD_APIs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
-To create a service to return a list of students
-jackson handles the json to pojo conversions
-jackson is auto included in spring
-jackson calls getter setter in the conversions

-to handle exceptions
1. first create a exception pojo class
2. create custom exception classes
3. update the rest controller
4. add exception handler method @ExceptionHandler

Global Exception Handler
@Controller

 */
@SpringBootApplication
public class PlaygroundRestCrudApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundRestCrudApIsApplication.class, args);
	}

}
