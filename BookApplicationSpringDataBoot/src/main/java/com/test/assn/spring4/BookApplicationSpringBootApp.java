package com.test.assn.spring4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.test.assn.spring4"})
@EnableAutoConfiguration
public class BookApplicationSpringBootApp {
	public static void main(String args[]) {
		SpringApplication.run(BookApplicationSpringBootApp.class, args);
	}
}
