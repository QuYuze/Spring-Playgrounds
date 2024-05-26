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
2. create beans and marked as a component @Component
3. create controller to expose an endpoint, inject the bean into the controller @Autowired
4. map the bean into the endpoint @GetMapping

@SpringBootApplication include default component scan
however, this only scan all the sub package of the main package
if we want to scan, say, org.edu.entities package, we need specify
manually setup the packages to scan
@SpringBootApplication(
		scanBasePackages = {"com.yuze.springboot.playground1",
				"com.yuze.springboot.entities"
		}
)

 */


@SpringBootApplication
public class Playground1Application {

	public static void main(String[] args) {

		//bootstrap spring app
		SpringApplication.run(Playground1Application.class, args);
	}

}
