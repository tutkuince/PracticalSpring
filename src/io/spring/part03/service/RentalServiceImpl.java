package io.spring.part03.service;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import io.spring.part03.model.Car;
import io.spring.part03.model.Customer;
import io.spring.part03.model.Rental;
import io.spring.part03.repository.CustomerRepository;
import io.spring.part03.repository.RentalRepository;

@Service
public class RentalServiceImpl implements RentalService {
	private CustomerRepository customerRepository;
	private RentalRepository rentalRepository;

	@Resource(name = "carList")	// Inject List
	private List<Car> carList;

	public RentalServiceImpl(CustomerRepository customerRepository, RentalRepository rentalRepository) {
		super();
		this.customerRepository = customerRepository;
		this.rentalRepository = rentalRepository;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
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
