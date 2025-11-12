package com.tns.avn.classobject;
//Demo for variables
//Static,Instance,Local

public class Student {
	
	//Instance variable
	int rollNo;
	String sname;
	String branch;
	
	//Static Variable
	String CollegeName = "AVNIET";
	
	//Method
	void print() {
	
	//Local Variable
		String msg = "These are the TNS Training Students";
		System.out.println(msg);
		System.out.println("Student Details: RollNO : "+ rollNo + ", Name : " + sname +", Branch : " + branch);
	

}

}