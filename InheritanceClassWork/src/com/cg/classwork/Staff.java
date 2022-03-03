package com.cg.classwork;

import java.util.Scanner;

public class Staff extends Person {
	String school;
	double pay;

	Scanner sc = new Scanner(System.in);
	void readSchool() {
		System.out.println("Enter the school of Staff : ");
		school = sc.nextLine();
		
	}
	void readPay() {
		System.out.println("Enter the Pay of staff : ");
		pay = sc.nextDouble(); 
	}
}
