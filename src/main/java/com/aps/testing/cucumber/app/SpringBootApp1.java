package com.aps.testing.cucumber.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.aps.testing.app.controllers.Responses;


@SpringBootApplication
@ComponentScan(basePackageClasses = Responses.class)
public class SpringBootApp1 {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 7777 );
		SpringApplication.run(SpringBootApp1.class, args);
		System.out.println("Server is running.");

	}

}
