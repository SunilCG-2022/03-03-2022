package com.cg.averageheight;

import java.util.Scanner;

public class AverageHeight {
	
	int n,height,sum=0,i;
	
	Scanner sc = new Scanner(System.in);
	
	public void averageHeight() {
		System.out.println("Enter the number of students :");
		n = sc.nextInt();
		System.out.println("Enter the heights of " +n+ " students: ");
		for( i=0; i<n ;i++ ) {
			height = sc.nextInt();
			sum = sum+height;
		}
		System.out.println("Average Height is :"+(float)sum/n);
	}

}
