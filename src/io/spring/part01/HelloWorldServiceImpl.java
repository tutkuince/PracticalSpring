package io.spring.part01;

public class HelloWorldServiceImpl implements HelloWorldService {
	@Override
	public String getMessage() {
		return "Hello World of Spring";
	}
}
