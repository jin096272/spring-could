package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
	//http://localhost:1111/config-dev.properties
	//http://localhost:1111/config/dev
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
