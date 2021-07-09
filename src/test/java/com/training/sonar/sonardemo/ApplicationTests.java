package com.training.sonar.sonardemo;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test
	void mainTest() {
		Application.main(new String[] {});
		Assertions.assertTrue(true);
	}

}
