package com.poc.rabbitMQ;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rabbitmq.client.ConnectionFactory;

@SpringBootApplication
public class CamelRabbitMQApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(CamelRabbitMQApplication.class, args);
	}
	/*@Bean
	public ConnectionFactory rabbitConnectionFactory() {
		ConnectionFactory cf = new ConnectionFactory();
		cf.setHost("localhost");
		//cf.setPort(5672);
		cf.setUsername("guest");
		cf.setPassword("guest");
		return cf;	
	}
*/
	@Override
	public void run(String... args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RabbitMQCamelRoute());
		context.start();
	}
}
