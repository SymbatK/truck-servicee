package io.javabrains.truckinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TruckInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruckInfoServiceApplication.class, args);
	}

}
