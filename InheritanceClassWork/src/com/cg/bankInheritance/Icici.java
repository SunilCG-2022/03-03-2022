package com.cg.bankInheritance;

import java.util.Scanner;

public class Icici extends Bank{
	Scanner sc= new Scanner(System.in);
	
	
	 void readIcici() {
		System.out.println("ICICI Bank----");
		System.out.println("Enter ICICI Pincipal Amount :");
		principalAmount = sc.nextFloat();
		System.out.println("Enter time : ");
		time = sc.nextFloat();
		System.out.println("Enter rate :");		
		rate = sc.nextFloat();

}
}
