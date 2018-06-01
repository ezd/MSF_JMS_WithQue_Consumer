package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsfJmsWithQueConsumerApplication {
	String msg;

	@JmsListener(destination="destination")
	void getMessageFromTheQueue(String message) {
		System.out.println("----------------comsumed messge is:"+message);
		this.msg = message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MsfJmsWithQueConsumerApplication.class, args);
	}
	
	@RequestMapping("/getmessage")
	String getmessage() {
		return this.msg;
	}
}
