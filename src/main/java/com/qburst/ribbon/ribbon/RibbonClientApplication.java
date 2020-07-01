package com.qburst.ribbon.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.qburst.ribbon.ribbon.config.RibbonConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "student-service", configuration = RibbonConfiguration.class)
public class RibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientApplication.class, args);
	}

}
