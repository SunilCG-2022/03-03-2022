package com.blocks;

public abstract class Shape {
	String color = "red";
	boolean filled = true;

	
	
	abstract void getColor();
	abstract void getFilled();
	abstract void setColor();
	abstract void setFilled();
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	

}
