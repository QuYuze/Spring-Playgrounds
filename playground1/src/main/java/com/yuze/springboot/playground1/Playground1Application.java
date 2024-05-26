package com.yuze.springboot.playground1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
add controllers
inject properties
add configurations
learn how to use command-lines to run the app

./mvnw package
./java -jar ./target/...snapshot....jar

or
./mvnw spring-boot:run


dependency injection and inversion of control
1. define dependency interface and class
2.
3.
 */
@SpringBootApplication
public class Playground1Application {

	public static void main(String[] args) {

		//bootstrap spring app
		SpringApplication.run(Playground1Application.class, args);
	}

}
