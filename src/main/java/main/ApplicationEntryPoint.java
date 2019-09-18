package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "routes", "entities" })
@EnableAutoConfiguration
public class ApplicationEntryPoint extends SpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationEntryPoint.class, args);
	}
}
