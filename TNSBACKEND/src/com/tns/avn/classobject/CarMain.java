package com.tns.avn.classobject;

public class CarMain {

	public static void main(String[] args) {
		
		//Creating an object
		Car c =new Car();
		c.speed = 120;
		c.name = "Tesla";
		c.model = "Model S Plaid";
		c.type = "Electric Sedan";
		c.print();
		
		Car c1 =new Car();
		c1.speed = 245;
		c1.name = "BMW";
		c1.model = "X5";
		c1.type = "SUV";
		c1.print();
		
		Car c2 =new Car();
		c2.speed = 180;
		c2.name = "Maruti Suzuki";
		c2.model = "Swift";
		c2.type = "Hatchback";
		c2.print();

	}

}
