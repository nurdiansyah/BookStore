package com.bookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

@SpringBootApplication
public class BookStoreApplication implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>{

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	@Override
	public void customize(ConfigurableWebServerFactory factory) {
		factory.setPort(7070);
	}

}
