package com.bit.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		//
		Goods camera = new Goods();
		//camera.name = "Samsung";
		camera.setName("Samsung");
		//camera.price = 400000;
		camera.setPrice(400000);
		
//		System.out.println(camera);
//		System.out.println("상품이름 : " + camera.getName());
//		System.out.println("가격 : " + camera.getPrice());
		
		Goods notebook = new Goods();
		Goods cup = new Goods();
		
		notebook.setName("LG그램");
		notebook.setPrice(9000000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
//		System.out.printf("Notebook : %s, %d%n", notebook.getName(), notebook.getPrice());
//		System.out.printf("Cup : %s, %d%n", cup.getName(), cup.getPrice());

		camera.showInfo();
		notebook.showInfo();
		cup.showInfo();
		
	}
	

}
