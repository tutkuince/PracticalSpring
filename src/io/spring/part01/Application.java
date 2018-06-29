package io.spring.part01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public HelloWorldService getMessageService() {
		return new HelloWorldServiceImpl();
	}

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		final MessageManeger messageManeger = context.getBean(MessageManeger.class);
		
		messageManeger.printMessage();
		
		context.close();
	}
}
