package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}




//what it will do where we will use
//@Component:This is a generic stereotype annotation which indicates that the class is a Spring-managed bean/component
//@Autowired:It is used to autowire spring bean on setter methods, instance variable, and constructor
//@Controller:The @Controller is a class-level annotation. It is a specialization of @Component. It marks a class as a web request handler.
//            It is often used to serve web pages. By default, it returns a string that indicates which route to redirect.
//            It is mostly used with @RequestMapping annotation.
//@ResponseBody:It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
//@RequestMapping:It is used to map the web requests.
//                It has many optional elements like consumes, header, method, name, params, path, produces, and value. We use it with the class as well as the method.
//@RestController:It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation.
//                It eliminates the need for annotating each method with @ResponseBody.
//@GetMapping:It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches
//            It is used instead of using: @RequestMapping(method = RequestMethod.GET)
//@PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable.
//               We can define multiple @PathVariable in a method.
//@ComponentScan:It scans all the components in the project
//@EnableAutoConfiguration:automatically configure what ever the dependencies you added in the project
//@SpringBootConfiguration: annotation in Spring Boot is a class-level annotation which indicates that this class provides the application configuration.


