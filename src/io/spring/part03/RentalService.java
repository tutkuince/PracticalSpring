package io.spring.part03;

import java.time.LocalDate;

public interface RentalService {

	public Rental rentACar(String customerName, Car car, LocalDate begin, LocalDate end);

}
