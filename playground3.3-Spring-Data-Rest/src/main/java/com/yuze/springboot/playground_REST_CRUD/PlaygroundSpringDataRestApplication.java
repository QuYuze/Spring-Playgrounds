package com.yuze.springboot.playground_REST_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 use Spring Data Rest to save boiler plate code for controller and Services
 it searches the entities uses in the repo
 lower case first letter and plurized the name to use as the api
 eg. Employee -> /employees

 Spring data rest does not handle complex plural forms peron -> pe0ple
 this case need to specify the plural name, also use this specify different path name

 default page size = 20, using query params you can navigate to different pages. page is zero based.

 /employees?page=0

 we can also sort by property name of entity
 eg. /employees?sort=firstName, desc
 */
@SpringBootApplication
public class PlaygroundSpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundSpringDataRestApplication.class, args);
	}

}
