package com.jenkins.testing.Jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

	public static final Logger logger=LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("it is a test class");
		assertEquals(true,true);
	}

}
