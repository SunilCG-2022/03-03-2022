package com.cg.classwork;

import java.util.Scanner;

public class Student extends Person {
	String batch;
	int year;
	double fee;
	
	Scanner sc = new Scanner(System.in);
	void readBatch() {
		System.out.println("Enter the Batch of student :");
		batch = sc.nextLine();
	}
	void readYear() {
		System.out.println("Enter the Student Year : ");
		year = sc.nextInt();
	}
	void readFee() {
		System.out.println("Enter the Student fee : ");
		fee = sc.nextDouble();
	}

}
