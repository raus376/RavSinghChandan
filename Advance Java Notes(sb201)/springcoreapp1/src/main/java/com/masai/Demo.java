package com.masai;

public class Demo {

public Demo() {
	System.out.println("object born/created");
}	

	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("Object dies/ destroyed..");
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1= null;
		System.gc();
		
		
	}
	
	
}


