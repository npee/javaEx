package com.bit.javaex.api.objectclass.examples;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(6, 4);
		Rectangle rect2 = new Rectangle(2, 12);
		Rectangle rect3 = new Rectangle(3, 3);
		Rectangle rect4 = rect3;
		
		System.out.println(rect1.equals(rect2));
		System.out.println(rect1.equals(rect3));
		System.out.println(rect1.equals(rect4));
		System.out.println(rect4.equals(rect3));
	}

}
