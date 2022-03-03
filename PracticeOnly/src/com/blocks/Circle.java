package com.blocks;

public class Circle extends Shape {	

	double radius = 1.0;

	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	void getColor() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void getFilled() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void setColor() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void setFilled() {
		// TODO Auto-generated method stub
		
	}



}
