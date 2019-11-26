package com.bit.javaex.oop.goods.v2;

public class Goods {
	// 필드(멤버 변수) 선언
	private String name;
	private int price;
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
