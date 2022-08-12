package com.masai;

public class Bike implements Vehicle{
	
	public void ride5() {
		System.out.println("ride started....");
	}

	@Override
	public void go() {
		ride5();
		
	}

}
