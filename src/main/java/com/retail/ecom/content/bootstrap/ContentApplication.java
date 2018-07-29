package com.retail.ecom.content.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.retail"})
public class ContentApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }

}