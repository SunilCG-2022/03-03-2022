package com.blocks;

class two { //Parent class
	static {
		System.out.println("inside parent Static block");
	}
	
	{   
		System.out.println("inside parent initialisation block");
	}
	
	two() { //constructor  
		System.out.println("inside parent constructor");
	}

}
public class one extends two {

	static {
		System.out.println("inside child static block");
	}

	{
		System.out.println("inside child initialization block");
	}
	
	one() {
		System.out.println("inside constructor of child");
	}

	public static void main(String[] args) {
		
		  new one(); new one();
		 
		System.out.println("inside main");
	}
}