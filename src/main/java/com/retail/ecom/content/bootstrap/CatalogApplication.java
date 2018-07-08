package com.retail.ecom.content.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.retail"})
public class CatalogApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(CatalogApplication.class, args);
    }

}
