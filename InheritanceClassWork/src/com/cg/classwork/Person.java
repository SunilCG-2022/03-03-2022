package com.cg.classwork;

import java.util.Scanner;

public class Person {
	String name;
	String address;
	
	Scanner sc = new Scanner(System.in);
	void readPersonDetails() {
		System.out.println("Enter details of person :");
		System.out.println("Enter name :");
		name = sc.nextLine();
		System.out.println("Enter Address :");
		address = sc.nextLine();
		}

	void printPersonDetails() {
		System.out.println("Person Details----");
		System.out.println("Person name :"+name);
		System.out.println("Person Address : "+address);
	}
}
