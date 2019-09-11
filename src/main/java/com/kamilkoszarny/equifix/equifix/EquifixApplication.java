package com.kamilkoszarny.equifix.equifix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EquifixApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(EquifixApplication.class);
	}

	public static void main(String[] args) {
		disableIllegalReflectiveAccessWarning();
		SpringApplication.run(EquifixApplication.class, args);
	}

	public static void disableIllegalReflectiveAccessWarning() {
		System.err.close();
		System.setErr(System.out);
	}

}
