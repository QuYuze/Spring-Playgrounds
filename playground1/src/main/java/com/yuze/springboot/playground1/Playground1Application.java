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

Three Injections:
Recommended:
Constructor
Setter

Not Recommended:
Field --> this only use in the legacy code now, this makes hard to uni test

Qualifiers:
if multiple implementations, which component it should choose?
use - @Qualifiers("cricketCoach) same as class name but first letter lowercase
this also valid in the setter injections

Alternatively, use @Primmary
-no need to specifiy name but mark @Primary at class level
Note: Qulifiers has higher prioty then Primary

@Lazy
initialize only when:
1. dependency injections
2. otherwise specified
-if not annotaed with @Lazy, spring initilize the beans when the app started
-we can also set this global app configutaion
spring.main.lazy-initialization = true

Scopes:
scopes can be specifed at the class level

Singleton - by default, all bean are singleton, only one instance in the app and share among requests
Prototype - new instance for each request

Spring bean life cycle methods
@PreDestroy
@PostConstruct

Config Bean
In case we have beans from third party without souce code, we cannot use @Component
Instead we use @Configuration and @Bean to config it as the spring
1. config the third party bean as the spring bean
2. inject the bean as the spring bean
3. mappings the bean

 */


@SpringBootApplication
public class Playground1Application {

	public static void main(String[] args) {

		//bootstrap spring app
		SpringApplication.run(Playground1Application.class, args);
	}

}
