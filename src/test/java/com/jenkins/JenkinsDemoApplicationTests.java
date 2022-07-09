package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	
	
	private static final Logger log = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("printing first log from context");
		boolean actual = true;
		assertEquals(actual,getBooleanValue());
	}

	private boolean getBooleanValue() {
		return true;
	}

}
