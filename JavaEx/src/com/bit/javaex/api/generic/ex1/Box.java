package com.bit.javaex.api.generic.ex1;

//	모든 객체를 담을 수 있는 Box 하나 설계
public class Box {
	Object obj;
	
	public void setContent(Object obj) {
		this.obj = obj;
	}
	
	public Object getContent() {
		return obj;
	}
}
