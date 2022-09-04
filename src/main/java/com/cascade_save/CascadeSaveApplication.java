package com.cascade_save;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mongock.runner.springboot.EnableMongock;

@SpringBootApplication
@EnableMongock
public class CascadeSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CascadeSaveApplication.class, args);
	}

}
