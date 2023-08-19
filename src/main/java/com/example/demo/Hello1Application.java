package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hello1Application {
  static final Logger logger=LoggerFactory.getLogger(Hello1Application.class);
	public static void main(String[] args) {
		logger.info("Application Started");
		logger.info("second time");
		logger.info("third time");
		SpringApplication.run(Hello1Application.class, args);
	}

}
