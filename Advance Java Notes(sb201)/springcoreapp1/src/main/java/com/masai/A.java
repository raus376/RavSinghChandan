package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

	@Service(value = "a1")
	public class A {
		
		@Autowired
		private B b1;


		@Autowired
		private Environment env;
		
		

		public void funA() {	
			System.out.println("inside funA of A");
			
			System.out.println(b1);
			System.out.println("Driver name  is "+env.getProperty("db.driverName"));
			System.out.println("Connection URL  is "+env.getProperty("db.url"));
			System.out.println("Username  is "+env.getProperty("db.username"));
			System.out.println("Password  is "+env.getProperty("db.password"));
		}
	}