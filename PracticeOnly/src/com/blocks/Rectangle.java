package com.blocks;

public class Rectangle extends Shape {
	double width = 1.0;
	double length = 1.0;
	

	
	

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	


	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	@Override
	void getColor() {
		System.out.println("The color of the rectangle");
		
	}

	
	void getFilled() {
		System.out.println("rectangle is filled");
		
	}

	@Override
	void setColor() {
		System.out.println("Set the color of rectangle");
		
	}

	@Override
	void setFilled() {
		System.out.println("Fill the rectangle");
		
	}

	
}
