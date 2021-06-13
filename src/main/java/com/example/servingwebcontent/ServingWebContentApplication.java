package com.example.servingwebcontent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ServingWebContentApplication {
	
	private final static Logger log = LoggerFactory.getLogger(ServingWebContentApplication.class);

	
    public static void main(String[] args) {
		
    	SpringApplication app = new SpringApplication(ServingWebContentApplication.class);

        Environment env = app.run(args).getEnvironment();
        log.info(
        		"\n---------------------------------\n" 
        		+ "Application '{}' is running.",
        		env.getProperty("spring.application.name")
        		);
    }

}
