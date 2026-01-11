package com.example.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	public void test() throws Exception {
		assertEquals("TOTO", "TOTO");
	}

}
