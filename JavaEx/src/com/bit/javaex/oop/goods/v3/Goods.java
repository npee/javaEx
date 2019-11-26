package com.bit.javaex.oop.goods.v3;

public class Goods {
	// 필드(멤버 변수) 선언
	private String name;
	private int price;
	
	// 생성자
	// 코드에 생성자가 하나도 없다면 컴파일러가 기본 생성자를 추가한다.
	// 생성자는 반드시 1개 이상 있어야함
	// 리턴값 없음
//	public Goods() {
//		사용자 정의 생성자를 만들었기때문에 자동으로 만들어주지 않았음
//	}
	public Goods(String name) {
		this.name = name;
	}
	public Goods(String name, int price) {
		// 부모 생성자 호출.
		// 부모 생성자를 호출 하지 않으면 컴파일러가 기본 부모생성자를 끼워넣는다.
		// super();
		// this.name = name;
		this(name);
		this.price = price;
	}
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	// Setter가 없으면 field는 Read Only가 된다
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
