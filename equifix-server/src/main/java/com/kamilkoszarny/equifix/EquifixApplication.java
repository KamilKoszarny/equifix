package com.kamilkoszarny.equifix;

import com.kamilkoszarny.equifix.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EquifixApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		disableIllegalReflectiveAccessWarning();
		SpringApplication.run(EquifixApplication.class, args);
	}

	private static void disableIllegalReflectiveAccessWarning() {
		System.err.close();
		System.setErr(System.out);
	}

	@Bean
	CommandLineRunner init(ArticleService articleService) {
		return args -> {
			articleService.getAllArticles().forEach(System.out::println);
		};
	}
}
