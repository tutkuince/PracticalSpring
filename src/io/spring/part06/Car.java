package io.spring.part06;

public class Car {
	private CarTypeEnum type;
	private String brand;
	private String model;

	public Car() {

	}

	public CarTypeEnum getType() {
		return type;
	}

	public void setType(CarTypeEnum type) {
		this.type = type;
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
