package io.spring.part04;

import org.springframework.beans.factory.support.ReplaceOverride;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Car car() {
		ReplaceOverride replace = new ReplaceOverride("breaks", "newBreak");
		replace.addTypeIdentifier("String");
		return new Car();
	}
	
	@Bean
	public NewBreak newBreak() {
		return new NewBreak();
	}
}
