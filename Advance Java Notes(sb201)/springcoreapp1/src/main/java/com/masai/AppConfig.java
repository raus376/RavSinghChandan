package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	
	
	@Bean("b1")
	public  B getB(){

		System.out.println("inside getB");
	B b1=new B();
	return b1;

	}	

}
