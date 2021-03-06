package com.cg.Iteminheritance;
import java.text.ParseException;
import java.util.Scanner;

public class ItemCrud {

	Item[] itemList = new Item[3];
	Item item;
	int noOfItems;	
	Scanner sc = new Scanner(System.in);
	char ch = 'y';

	public void enterItemDescription() throws ParseException {

		while (ch == 'y') {

			System.out.println("Enter the choice :" );
			System.out.println("add  : to add into Basket");
			System.out.println("remove : to remove from Basket");
			System.out.println("display : to display Basket ");
			sc.nextLine();
			String choice = sc.nextLine();

			switch (choice) {
			case "add":
				addItemToBasket();
				break;
			case "remove":
				removeItemFromBasket();
				break;
			case "display":
				displayBasket();
				break;
			default:
				System.out.println("Enter a proper choice");
				break;
			}
			System.out.println("If you want to continue....");
			System.out.println("Enter 'y' ...");
			ch =sc.next().charAt(0);
			
		}
		
	}


	void addItemToBasket() {
		System.out.println("Enter the item details----");
		System.out.println("Enter the number of Items");
		noOfItems = sc.nextInt();
		for(int i=0;i<noOfItems;i++) {
			item = new Item();
			item.readItems();
			itemList[i] = item;			
		}
	}
	void removeItemFromBasket() {
		System.out.println("Enter the item to remove : ");
		System.out.println("Enter the Item Id to remove : ");
		int iid = sc.nextInt();
		for(int i=0; i<noOfItems; i++) {
			if(itemList[i].itemId == iid) {
				itemList[i] = null;
				System.out.println("Item removed");
				break;
			}else {
				System.out.println("Item not found...");
			}

		}
	}
	void displayBasket() {
		System.out.println("Enter the details to display");


		for (int i = 0; i < noOfItems; i++) {
			if(itemList[i] == null) {
				continue;
			}
			itemList[i].displayItems();
		}
	}
}
