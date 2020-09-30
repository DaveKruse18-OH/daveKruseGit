package com.techelevator;

public class RectangleWall extends Wall {
	private int length;
	private int height;

	//public RectangleWall(String name, String color) {
	//	super(name, color);
	//}
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}

	@Override
	public String toString() {
		System.out.println(super.getName() + " (" + this.length + "x" + this.height + ") " + "rectangle");
		return (super.getName() + " (" + this.length + "x" + this.height + ") " + "rectangle");
	}
	
	@Override
	public int getArea() {
		return length * height;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
}
