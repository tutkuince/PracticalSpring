package io.spring.part02.decopled;

public class HelloWorldMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
