package com.bit.javaex.api.objectclass.examples;

public class Circle {
	//	field
	private int x;
	private int y;
	private int radius;
	
	//	constructor
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//	method
	public int getRadius() {
		return radius;
	}

	@Override
	public boolean equals(Object obj) {
		// 캐스팅가능여부
		if (obj instanceof Circle) {
			Circle circle = (Circle)obj;
			return circle.getRadius() == getRadius();
		}			
		
		return super.equals(obj);
	}
	
	
}
