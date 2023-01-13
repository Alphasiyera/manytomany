package com.example.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.example.manytomany")
public class ManytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

}
