package com.example.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulerEventListenerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerEventListenerDemoApplication.class, args);
	}
}
