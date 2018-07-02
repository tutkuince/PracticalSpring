package io.spring.part04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = (Car) context.getBean("car");
		car.design();
		car.breaks();

		context.close();
	}
}
