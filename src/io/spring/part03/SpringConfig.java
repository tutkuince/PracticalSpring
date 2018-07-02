package io.spring.part03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
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
