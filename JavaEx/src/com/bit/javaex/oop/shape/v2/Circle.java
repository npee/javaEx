package com.bit.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	
	
	
	// field
	protected int width;
	protected int height;
	protected int radius;
	
	// constructor
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// abstract method
	@Override
	public void draw() {
		System.out.printf("원 [%d, %d, area=%f]%n",
				x, y, area());
		
	}
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius,  2);
		return area;
	}
}
