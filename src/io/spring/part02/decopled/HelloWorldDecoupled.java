package io.spring.part02.decopled;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		
		mr.setMessageProvider(mp);
		mr.render();
	}
}
