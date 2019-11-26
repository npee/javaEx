package com.bit.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		//
		Goods camera = new Goods();
		camera.name = "samsung";
		camera.price = 400000;
		
		System.out.println(camera);
		System.out.println("상품이름 : " + camera.name);
		System.out.println("가격 : " + camera.price);
		
		Goods notebook = new Goods();
		Goods cup = new Goods();
		
		notebook.name = "LG그램";
		notebook.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.printf("Notebook : %s, %d%n", notebook.name, notebook.price);
		System.out.printf("Cup : %s, %d%n", cup.name, cup.price);

	}
	

}
