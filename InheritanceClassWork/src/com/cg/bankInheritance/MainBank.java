package com.cg.bankInheritance;

public class MainBank {

	public static void main(String[] args) {
		Sbi sbi=new Sbi ();
		sbi.readSbi();
		sbi.getRateOfInterest();
		
		Icici icici =new Icici();
		icici.readIcici();
		icici.getRateOfInterest();
		
		Axis axis =new Axis();
		axis.readAxis();
		axis.getRateOfInterest();
		
		

	}

}
