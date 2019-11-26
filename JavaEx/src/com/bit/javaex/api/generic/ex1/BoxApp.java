package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		//	Box 클래스 테스트
		Box intBox = new Box();
		intBox.setContent(2019);
		//	내용물을 꺼내봅시다
		int retVal = (int)intBox.getContent();
		
		System.out.println(retVal);

		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		
		System.out.println(strVal);
		//	Object 타입을 데이터 참조하게 되면
		//		캐스팅 문제 등 여러가지 부가적인 문제가 발생
		
		//	만약에 캐스팅을 잘못 했다면?
		//strVal = (String)intBox.getContent(); //ClassCastException
		//System.out.println(strVal);
		//	intBox가 뭔지 모르는 상태에서 캐스팅을 했기 때문

	}


}
