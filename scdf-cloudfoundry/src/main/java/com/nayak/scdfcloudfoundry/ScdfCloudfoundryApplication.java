package com.nayak.scdfcloudfoundry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@EnableDataFlowServer
@SpringBootApplication
public class ScdfCloudfoundryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdfCloudfoundryApplication.class, args);
	}
}
