package com.bit.javaex.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	// 	Vector
	//		- 버퍼형 자료형
	//		- 순서가 있는 객체들의 집합
	public static void main(String[] args) {
		//	벡터 생성
		Vector v = new Vector();	// Generic으로 타입 미지정 -> Object
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		Vector<Integer> v2 = new Vector<>(8);
		//	Integer를 담을 8개 공간을 가진 벡터
		System.out.println("Size : " + v2.size() + ", Capacity : " + v2.capacity());
	
		//	1부터 10까지 값을 담아봅시다
		for (int i = 1; i <= 10; i++) {
			v2.addElement(Integer.valueOf(i));
			//	wrapper 클래스는 자동 wrapping 되므로
			//	v2.addElement(i); 로 해도 무방	
		}
		System.out.println("Size : " + v2.size() + ", Capacity : " + v2.capacity());
		//	용량을 초과하면 자동으로 증가(Capacity만큼)
		//	v2.capacity : 8 -> 16
		
		System.out.println("v2에 7이 있는가? : " + v2.contains(7));
		//	v2에 7은 몇 번 인덱스에 있는가?
		System.out.println("Index of 7 : " + v2.indexOf(7));
		//	중간에 객체 삽입
		v2.insertElementAt(11, 5);
		
		//	객체 조회
		System.out.println("index 5's value : " + v2.elementAt(5));
		
		//	객체 검색 : 없는 객체
		System.out.println("없는 객체의 검색 : " + v2.indexOf(0));
		
		//	객체 삭제
		v2.remove(10);
		System.out.println(v2);
		v2.remove(Integer.valueOf(11));
		System.out.println(v2);
		
		//	내부 데이터를 순회하고자 하는 경우
//		for (Integer i: v2) {
//			System.out.println("Element : " + i);
//		}
		//	나중에 다른 방식으로 바꿀 예정..
		//	-> Enumeration
		//	enumeration : Vector, HashTable
		Enumeration<Integer> e = v2.elements();
		
		//	Loop
		while (e.hasMoreElements()) {//	데이터를 더 가지고 있으면
			Integer item = e.nextElement();
			System.out.println("Element(enum) : " + item);
		}
		//	메모리 접근 효율이 더 좋다.
		
		
		
		//	버퍼 비우기
		v2.clear();
		System.out.println(v2);
		System.out.printf("Size : %d, Cap : %d%n", v2.size(), v2.capacity());
		//	늘어난 용량은 그대로더라
		
		//	Number를 호가장한 모든 클래스를 담을 수 있는 벡터
		//		-> Generic의 활용
		Vector<? super Number> numVector = new Vector<>();
		numVector.addElement(Integer.valueOf(2019));	//	Integer
		numVector.addElement(Float.valueOf(3.14159f));	//	Float
		//	numVector.addElement("Java");				//	String : NaN
		

	}

}
