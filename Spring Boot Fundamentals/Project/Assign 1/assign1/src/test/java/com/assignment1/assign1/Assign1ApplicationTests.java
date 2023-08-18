package com.assignment1.assign1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class Assign1ApplicationTests {
	@Autowired
	private CalculateSum sum;

	@Test
	void testSum() {
		assertEquals(10, sum.sum(5, 5));
	}

}
