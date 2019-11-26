package com.bit.javaex.oop.shape.v2;

public class Rectangle extends Shape
	implements Drawable {
	//	implements 키워드를 이용해 interface 구현
	
	
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
//	@Override
//	public void draw() {
//		System.out.printf("사각형 [%d, %d, w=%d, h=%d, area=%f]%n",
//				x, y, width, height, area());
//	}
	
	public void draw() {
	System.out.printf("사각형 [%d, %d, w=%d, h=%d, area=%f]%n",
			x, y, width, height, area());
}
	
	
	
	
	@Override
	public double area() {
		return width * height;
	}
}
