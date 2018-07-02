package io.spring.part03.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.spring.part03.repository.CustomerRepositoryImpl;
import io.spring.part03.repository.RentalRepositoryImpl;
import io.spring.part03.service.RentalServiceImpl;

@Configuration
@ComponentScan(basePackages = "io.spring")
public class SpringConfig {
	@Autowired
	private CustomerRepositoryImpl customerRepository;
	@Autowired
	private RentalRepositoryImpl rentalRepository;

	@Bean
	public RentalServiceImpl rentalService() {
		return new RentalServiceImpl(customerRepository, rentalRepository);
	}
}
