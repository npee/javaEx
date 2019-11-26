package com.bit.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(3, 7);
		Point p2 = new Point(3, 1);
		
//		p1.setX(3); p1.setY(7);
//		p2.setX(8); p2.setY(1);
		
		p1.draw();
		p1.draw(true);
		p2.draw();
		p2.draw(false);
		
		Point p3 = new ColorPoint(30, 30, "RED");
		p3.draw();
		p3.draw(false);
	}

}
