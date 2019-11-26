package com.bit.javaex.oop.shape.v1;

public class Rectangle extends Shape {
	// field
	protected int width;
	protected int height;
	
	// constructor
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// abstract method
	@Override
	public void draw() {
		System.out.printf("사각형 [%d, %d, w=%d, h=%d, area=%f]%n",
				x, y, width, height, area());
		
	}
	@Override
	public double area() {
		return width * height;
	}
}
