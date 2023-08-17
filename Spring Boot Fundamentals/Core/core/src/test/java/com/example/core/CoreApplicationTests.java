package com.example.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.core.service.PaymentService;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService service;

	@Test
	void testDependencyInjection() {
		assertNotNull(service);
	}

}
