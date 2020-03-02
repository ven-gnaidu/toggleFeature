package com.globalConfig.globalConfig;

import kafka.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GlobalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalConfigApplication.class, args);
	}

}
