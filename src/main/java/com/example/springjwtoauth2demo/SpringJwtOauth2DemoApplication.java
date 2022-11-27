package com.example.springjwtoauth2demo;

import com.example.springjwtoauth2demo.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class SpringJwtOauth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtOauth2DemoApplication.class, args);
	}

}
