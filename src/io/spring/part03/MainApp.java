package io.spring.part03;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.part03.config.SpringConfig;
import io.spring.part03.model.Car;
import io.spring.part03.model.Rental;
import io.spring.part03.service.RentalService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		RentalService rentalService = context.getBean("rentalService", RentalService.class);

		Rental rental = rentalService.rentACar("Tutku Ince", new Car("Ford", "Focus"), LocalDate.now(),
				LocalDate.now().plusDays(14));
		System.out.println("Rental status: " + rental.isRented());
		
		context.close();
	}
}
