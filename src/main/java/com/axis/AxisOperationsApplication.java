package com.axis;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@OpenAPIDefinition( info = @Info(
		title = "Axis Bank Test Platform",
		version = "1.0",
		description = "This is Axis Bank application"
)
)
public class AxisOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxisOperationsApplication.class, args);
	}

}
