package com.bit.javaex.api.objectclass.ex02;

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
	
	//	내부 값의 비교를 위해서 equals 메서드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			//	obj는 Point의 객체 -> 캐스티 가능
			Point other = (Point)obj;
			//	각 x, y값을 비교할 수 있다
			return (x == other.x) && (y == other.y);
		}
		return super.equals(obj);	//	Point가 아닐 경우
	}
}
