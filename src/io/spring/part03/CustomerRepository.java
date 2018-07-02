package io.spring.part03;

public interface CustomerRepository {

	public Customer getCustomerByName(String fullName);

	public void save(Customer customer);
}
