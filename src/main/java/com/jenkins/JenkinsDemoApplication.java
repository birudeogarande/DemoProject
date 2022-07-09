package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	
	private static final Logger log = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application started...");
	}
	public static void main(String[] args) {
		log.info("Application executed..");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
