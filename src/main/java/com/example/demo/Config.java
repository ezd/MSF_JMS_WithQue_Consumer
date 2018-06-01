package com.example.demo;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class Config {

//	@Value("{destination}")
//	String destination;
//	@Value("{myactiveMQurl}")
//	String mqUrl;
	
//	@Bean
//	Queue queue() {
//		Queue queue=new ActiveMQQueue(this.destination);
//		return queue;
//	}
	@Bean
	ActiveMQConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory activeMQConnectionFactory=new ActiveMQConnectionFactory("tcp://localhost:61616");
		return activeMQConnectionFactory;
	}
	
//	@Bean
//	JmsTemplate jmsTemplate() {
//		return new JmsTemplate(activeMQConnectionFactory());
//	}
}
