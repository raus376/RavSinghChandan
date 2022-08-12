package com.masai;

public class Car implements Vehicle {
	
	public void start2() {  
		System.out.println("Car started...");
	}

	@Override
	public void go() {
		start2();
		
	}

}
