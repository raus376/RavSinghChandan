package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		A a1= ctx.getBean("a1",A.class);
		
		a1.funA();
	}
}
