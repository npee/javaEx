package com.bit.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스
		Drawable r = new Rectangle(10, 20, 50,200);
		r.draw();
		
		Drawable c = new Circle(20, 20, 10);
		c.draw();
		
		//	Rectangle, Circle은 Shape를 상속받은 객체
		//	Point는 직접 상속관계에 포함되지 않은 별개의 객체
		//	인터페이스 Drawable을 공통적으로 구현한 객체이기 때문에
		//	Drawable 타입으로 참조할 수 있다.
		
		c = new Point(10, 10);
		
		if (c instanceof Drawable) {
			c.draw();
		}
		
		Drawable[] objs = new Drawable[3];
		objs[0] = new Rectangle(10, 10, 100, 50);
		objs[1] = new Circle(20, 20, 50);
		objs[2] = new Point(30, 30);
		
		for (Drawable obj: objs) {
			obj.draw();
		}
		
	}
}
