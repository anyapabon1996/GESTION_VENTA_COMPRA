package com.session.four.buy.Buy_Sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BuySellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuySellApplication.class, args);
	}

}
