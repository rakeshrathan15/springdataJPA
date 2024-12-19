package com.neoteric.JPASpringBootData;

import com.neoteric.JPASpringBootData.InheritanceinJPA.FutureStock;
import com.neoteric.JPASpringBootData.InheritanceinJPA.OptionStock;
import com.neoteric.JPASpringBootData.InheritanceinJPA.RestrictedStock;
import com.neoteric.JPASpringBootData.InheritanceinJPA.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.neoteric.JPASpringBootData")

public class JpaSpringBootDataApplication {



	public static void main(String[] args) {
		SpringApplication.run(JpaSpringBootDataApplication.class, args);
	}



}
