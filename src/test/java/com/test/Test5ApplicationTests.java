package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test5ApplicationTests {

	@Test
	void additiontest() {
		assertEquals(10,Calculator.add(5, 5));
	}
	
	@Test
	void subtractiontest() {
		assertEquals(10,Calculator.sub(5, 5));
	}

}
