package io.spring.part03;

import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class RentalServiceTest {
	
	@Test
	public void add_new_rental() {
		Car car = new Car("Ford", "Fiesta");
		
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		RentalRepository rentalRepository = new RentalRepositoryImpl();
		RentalService service = new RentalServiceImpl(customerRepository, rentalRepository);
		
		LocalDate rentalBegin = LocalDate.of(2018, Month.JULY, 2);
		LocalDate rentalEnd = LocalDate.of(2018, 7, 14);
		
		Rental rental = service.rentACar("Tutku Ince", car, rentalBegin, rentalEnd);
		
		assertTrue(rental.isRented());
	}
}
