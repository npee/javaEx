package com.bit.javaex.collection;
//	HashSet
//		중복 허용 안함
//		자료구조의 순서, 키 상관없이 하나의 집합으로 관리

import java.util.HashSet;

public class HashSetEx {
	
	public static void basicHashSet() {
		//	Java의 기본 객체들을 테스트
		//	HashSet 생성
		HashSet<String> hs = new HashSet<>();
		
		//	객체 추가
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		System.out.println(hs);
		System.out.println("SIZE : " + hs.size());
		
		//	포함여부 확인
		System.out.println(hs.contains("C++"));
		System.out.println("없는 데이터 확인(Linux) : " + hs.contains("Linux"));
		
		//	객체 삭제
		hs.remove("C++");
		System.out.println("SET : " + hs);
		
		hs.clear();
		System.out.println("SET : " + hs);
		//	셋 비우기
	}
	
	public static void customClassHashSet() {
		//	사용자 정의 클래스를 HashSet에서 사용할 수 있도록
		HashSet<Student> hs = new HashSet();	//	Generic : Student
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("홍길동", 10);	
		
		//	HashSet에 담아봅시다
		hs.add(s1); hs.add(s2); hs.add(s3);
		System.out.println("HashSet : " + hs);	//	s1, s3은 별개의 객체인데 구별이 안된다
		
		//	s1, s2의 hashCode확인
		System.out.println("hashcode of s1 : " + s1.hashCode());
		System.out.println("hashcode of s2 : " + s2.hashCode());
		System.out.println("hashcode of s3 : " + s3.hashCode());
		//	hashCode
		//		빠른 검색을 위해 객체럴 식별하기 위한 하나의 정수값
		//		Object 클래스는 hashCode로 메모리 주소값을 쓴다
		
		//	만약에 Student 객체가 이름과 id가 같다면?
		//	-> 동등 객체로 판단해 줘야 같은 값을 가진 객체가 넘어올때
		//		중복 삽입을 막을 수 있다.
		//	1. 객체 내부에서 hashCode() Override -> 다르면 다른 객체		
		//	2. 1번이 같으면 객체 내부에서 equals() Override -> 다르면 다른 객체
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basicHashSet();
		customClassHashSet();
	}

}
