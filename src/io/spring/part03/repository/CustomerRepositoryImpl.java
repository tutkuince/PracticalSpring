package io.spring.part03.repository;

import org.springframework.stereotype.Component;

import io.spring.part03.model.Customer;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
	@Override
	public Customer getCustomerByName(String fullName) {
		return null;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub

	}

}
