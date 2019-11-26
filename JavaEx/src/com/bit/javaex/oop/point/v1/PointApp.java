package com.bit.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setX(3); p1.setY(7);
		p2.setX(8); p2.setY(1);
		
		p1.draw();
		p2.draw();
	}

}
