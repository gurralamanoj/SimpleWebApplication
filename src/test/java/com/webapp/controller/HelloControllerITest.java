package com.webapp.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = HelloController.class)
public class HelloControllerITest {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void getHello() throws Exception {
		System.out.println("Testing HelloControllerITest");
		ResponseEntity<String> response = template.getForEntity("/", String.class);
		System.out.println(response.toString());
		assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
	}
}