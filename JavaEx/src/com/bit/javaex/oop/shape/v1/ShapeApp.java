package com.bit.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스
		Shape r = new Rectangle(10, 20, 50,200);
		r.draw();
		
		Shape c = new Circle(20, 20, 10);
		c.draw();
	}

}
