package com.bit.javaex.oop.staticmember;

//	Singleton 예제
//		전체 프로그램 내에서 유일하게 한 개의 인스턴스만
//	 	유지해야 할 경우

public class Singleton {
	static Singleton instance = new Singleton();
	
	private Singleton() {
		//	new 생성 자체 불가
		
	}
	
	//	생성자가 private이므로 new로 생성할 수 없으니
	//		instance를 확보할 수 있는 메서드가 있어야 한다.
	public static Singleton getInstance() {
		return instance;	//	프로그램 전체에서 단일 instance유지
	}
}
