package com.cg.bankInheritance;

import java.util.Scanner;

public class Axis extends Bank{
	Scanner sc= new Scanner(System.in);
	
	
	 void readAxis() {
		System.out.println("Axis Bank----");
		System.out.println("Enter Axis bank Pincipal Amount :");
		principalAmount = sc.nextFloat();
		System.out.println("Enter time : ");
		time = sc.nextFloat();
		System.out.println("Enter rate :");	
		rate = sc.nextFloat();

}
}
