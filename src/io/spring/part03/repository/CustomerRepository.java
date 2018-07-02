package io.spring.part03.repository;

import io.spring.part03.model.Customer;

public interface CustomerRepository {

	public Customer getCustomerByName(String fullName);

	public void save(Customer customer);
}
