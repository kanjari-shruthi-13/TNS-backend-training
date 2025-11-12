package com.tns.avn.classobject;

public class StateMain {

	public static void main(String[] args) {
		
		StateInIndia s = new StateInIndia();
		s.statename = "Telangana";
		s.capital = "Hyderabad";
		s.districts = 31;
		s.print();
		
		StateInIndia s1 = new StateInIndia();
		s1.statename = "Andhra pradesh";
		s1.capital = "Amaravathi";
		s1.districts = 29;
		s1.print();

	}

}
