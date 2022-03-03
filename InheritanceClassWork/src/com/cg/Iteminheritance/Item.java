package com.cg.Iteminheritance;

import java.util.Scanner;

public class Item {
	String itemName;
	int itemId;
	String itemDescription;
	String itemPrice;
	
	Scanner sc= new Scanner(System.in);
	void readItems() {
		System.out.println("Enter the Item name :");
		itemName = sc.nextLine();
		System.out.println("Enter the Item Id :");
		itemId = sc.nextInt();
		sc.nextLine();	
		System.out.println("Enter item Description :");
		itemDescription =  sc.nextLine();
		System.out.println("Enter the Price : ");
		itemPrice =  sc.nextLine();	
	}
	public void displayItems() {
		System.out.println("Entered Item data---");
		System.out.println("Item Name :" + itemName);
		System.out.println("Item ID: "+itemId);
		System.out.println("Item Description : "+itemDescription);
		System.out.println("Item Price : "+itemPrice);
	}
	 
}
