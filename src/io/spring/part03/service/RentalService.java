package io.spring.part03.service;

import java.time.LocalDate;

import io.spring.part03.model.Car;
import io.spring.part03.model.Rental;

public interface RentalService {

	public Rental rentACar(String customerName, Car car, LocalDate begin, LocalDate end);

}
