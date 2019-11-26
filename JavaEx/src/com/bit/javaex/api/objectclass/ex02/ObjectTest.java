package com.bit.javaex.api.objectclass.ex02;

public class ObjectTest {
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		//	Java의 최상위 클래스는 Object
		//	-> 기본적으로 모든 클래스는
		//		Object가 가진 모든 메서드를 사용할 수 있다.
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode : " + p.hashCode());
		System.out.println("toString : " + p.toString());
		System.out.println("Point : " + p);	//toString()생략
	
		//	== 은 객체의 동일성 비교 : 같은 객체냐를 비교
		// .equals()는 객체의 값비교 : 같은 값이냐를 비교	
		Point p2 = new Point(10, 10);	//	p와 x, y 값이 같다
		System.out.println("p와 p2는 같은 객체인가? " + (p == p2));
		
		//	Point p와 Point p2의 값을 비교해 봅시다
		System.out.println("p와 p2는 같은 값을 가지고 있는가? "
		+ p.equals(p2));
	}
}
