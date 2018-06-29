package io.spring.part01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManeger {
	
	@Autowired
	private HelloWorldService service;
	
	public void printMessage() {
		System.out.println(this.service.getMessage());
	}
}
