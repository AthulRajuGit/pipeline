package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Hello1ApplicationTests {

	static final Logger logger=LoggerFactory.getLogger(Hello1ApplicationTests.class);
	@Test
	void contextLoads() {
	assertEquals(true,true);
	}

}
