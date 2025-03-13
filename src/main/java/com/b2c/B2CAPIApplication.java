package com.b2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 *
 * @author Moses Kipyegon
 */

@SpringBootApplication
@EntityScan(basePackages = {"com.b2c"})
public class B2CAPIApplication {
	public static void main(String[] args) {
		SpringApplication.run(B2CAPIApplication.class, args);
	}
}
