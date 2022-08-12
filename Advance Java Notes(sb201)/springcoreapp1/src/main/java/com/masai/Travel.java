package com.masai;

public class Travel {

	//Object type
	Vehicle v;
	
	//simple type
	 int numberOFPerson ;
	
	 
	 public void journey() {
			
			v.go();
			
			System.out.println("Jounrney started...");
			System.out.println("number of person are :"+numberOFPerson);
		}
		
	 

	public Travel(Vehicle v, int numberOFPerson) {
		super();
		this.v = v;
		this.numberOFPerson = numberOFPerson;
	}


	public void setV(Vehicle v) {
		this.v = v;
	}


	public void setNumberOFPerson(int numberOFPerson) {
		this.numberOFPerson = numberOFPerson;
	}








	
	
}
