package io.spring.part03.model;

public class Rental {
	private Customer customer;
	private Car car;
	
	public boolean isRented() {
		if(customer != null && car != null)
			return true;
		return false;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
