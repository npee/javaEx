package com.bit.javaex.api.objectclass.ex01;

//	특정 클래스를 extends 하지 않아도
//		java.lang.Object 클래스를 상속받게 된다
//		java의 최상위 클래스는 언제나 Object
public class Point {
	//	field
	private int x;
	private int y;
	
	//	constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	문자열 출력을 위한 toString 메서드 오버라이드
	@Override
	public String toString() {
		//	출력할 데이터 문자열을 리턴
		return String.format("Point(%d, %d)", x, y);
		
	}
}
