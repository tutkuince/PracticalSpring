package io.spring.part03;

public class Car {
	private String brand;
	private String model;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
