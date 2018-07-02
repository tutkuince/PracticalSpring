package io.spring.part03;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService {
	private CustomerRepository customerRepository;
	private RentalRepository rentalRepository;

	public RentalServiceImpl(CustomerRepository customerRepository, RentalRepository rentalRepository) {
		super();
		this.customerRepository = customerRepository;
		this.rentalRepository = rentalRepository;
	}

	public Rental rentACar(String fullName, Car car, LocalDate rentalBegin, LocalDate rentalEnd) {
		Customer customer = customerRepository.getCustomerByName(fullName);

		if (customer == null) {
			customer = new Customer(fullName);
			customerRepository.save(customer);
		}

		Rental rental = new Rental();
		rental.setCar(car);
		rental.setCustomer(customer);

		rentalRepository.save(rental);
		return rental;
	}
}
