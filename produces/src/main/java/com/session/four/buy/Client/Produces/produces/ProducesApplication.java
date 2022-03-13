package com.session.four.buy.Client.Produces.produces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducesApplication.class, args);
	}

}
