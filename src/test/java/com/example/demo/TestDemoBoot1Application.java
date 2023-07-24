package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.OracleContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoBoot1Application {

	@Bean
	@ServiceConnection
	OracleContainer oracleContainer() {
		return new OracleContainer("gvenzl/oracle-xe:latest");
	}

	public static void main(String[] args) {
		SpringApplication.from(DemoBoot1Application::main).with(TestDemoBoot1Application.class).run(args);
	}

}
