package com.cg.corejava;
import java.util.Scanner;

public class MathOperations {
	int numberOne;
	int numberTwo;
	float Total;
	
	Scanner sc = new Scanner(System.in);
	
	public void readNumbers() {
		System.out.println("Enter the first number : ");
		numberOne = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		numberTwo = sc.nextInt();		
		
	}
	public void addition() {
		Total = numberOne + numberTwo;
		System.out.println("Additon : "+Total);
	}
	void multiplication() {
		Total = numberOne * numberTwo;
		System.out.println("Multiplication : "+Total);
	}
	void substraction() {
		Total = numberOne - numberTwo;
		System.out.println("Substraction : "+Total);
	}

	void division() {
		Total = numberOne / numberTwo;
		System.out.println("Division : "+Total);
	}
	
}
