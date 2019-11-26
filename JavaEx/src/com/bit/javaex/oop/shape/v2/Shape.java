package com.bit.javaex.oop.shape.v2;

//	도형을 작성하기 위한 부모 설계 클래스
//		실체화 할 필요 없음 -> 추상

public abstract class Shape {
	//	field
	protected int x;
	protected int y;
	
	//	constructor
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	method - 추상 메서드는 구현부 없음. 자식이 구현
	//	public abstract void draw();
	//	IDrawable에 위임
	public abstract double area();
	
}
