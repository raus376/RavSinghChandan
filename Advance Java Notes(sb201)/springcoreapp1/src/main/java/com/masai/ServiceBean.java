package com.masai;

//SL class
public class ServiceBean {
	
	private DAOBean dao1 ;
	
	private DAOBean dao2 ;
	

	public void setDao1(DAOBean dao1) {
		this.dao1 = dao1;
	}
	
	
	
	
	public void setDao2(DAOBean dao2) {
		this.dao2 = dao2;
	}




	public void calculateInterest() {
		dao1.findAccount();
		dao2.findAccount();
		System.out.println("Interest calculated in Service Layer..");
	}

}
