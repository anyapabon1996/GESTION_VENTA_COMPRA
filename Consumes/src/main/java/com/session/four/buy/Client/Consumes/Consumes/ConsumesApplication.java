package com.session.four.buy.Client.Consumes.Consumes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumesApplication.class, args);
	}

}
