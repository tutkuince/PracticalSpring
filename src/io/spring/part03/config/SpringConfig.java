package io.spring.part03.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.spring.part03.model.Car;
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
	
	@Bean
	public List<Car> carList(){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Mercedes", "A180CDI"));
		cars.add(new Car("BMW", "116D"));
		return cars;
	}
}
