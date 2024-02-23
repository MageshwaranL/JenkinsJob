package com.jenkins.testing.Jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication implements CommandLineRunner{
	
	public static final Logger logger=LoggerFactory.getLogger(JenkinsApplication.class);

	public static void main(String[] args) {
	    
	    logger.info("it is a continous integration job");
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("it is my second logger");
		
	}

}
