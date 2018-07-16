package io.spring.part06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		Car car = context.getBean("fiesta", Car.class);
		
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Model: " + car.getModel());
		System.out.println("Type: " + car.getType());
		
		context.close();
	}
}
