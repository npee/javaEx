package com.bit.javaex.api.generic.ex2;

//	Generic을 이용해서
//		설계시에는 내부 데이터 타입을 지정하지 않고 설계
//		실체 객체화 할때 내부 데이터 타입을 사용하도록 강제

//	많이 사용하는 파라미터 관례
//	T : Type
//	R : Return Type
//	K : Key
//	V : Value
//	강제는 아니지만 관례는 가능한 지키도록 합시다.

public class Box<T> {
	T content;
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}
}
