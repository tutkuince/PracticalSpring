package io.spring.part06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfig {

	@Bean
	@Scope("prototype")
	public Car car() {
		Car car = new Car();
		car.setType(CarTypeEnum.CAR);
		return car;
	}

	@Bean
	public Car clio() {
		Car car = car();
		car.setBrand("Renault");
		car.setModel("Clio");
		return car;
	}

	@Bean
	public Car fiesta() {
		Car car = car();
		car.setBrand("Ford");
		car.setModel("Fiesta");
		return car;
	}

	@Bean
	public Car a5() {
		Car car = car();
		car.setBrand("Audi");
		car.setModel("A5");
		return car;
	}

}
