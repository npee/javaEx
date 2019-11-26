package com.bit.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper 클래스 (포장 클래스)
		//	자바는 기본적으로 객체를 다루는 언어
		//	경우에 따라 객체가 아니면 사용할 수 없는 메서드들이 많다
		//	이런 메서드의 경우 기본 타입을 직접 사용할 수 없고
		//	포장 클래스로 포장해서 넘겨주어야 한다.
		Integer i = new Integer(10);
		Character c = new Character('c');
		//	new를 이용한 wapper 클래스의 생성은 JDK9에서 deprecated.
		//	-> 앞으로는 valueOf를 사용하도록 한다
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//	valueOf의 경우 문자열로 넣어도 됨
		Integer i2 = Integer.valueOf("10");
		Double d2 = Double.valueOf("3.14159");
		//	** 중요 : valueOf에 넘겨준 문자열이 해당 자료형의 형태여야 함
		//	Integer i3 = Integer.valueOf("a123"); >> NumberFormatException
		
		//	변환 관련 메서드들 : parse 계열의 메서드
		//		-> 문자열을 해당 데이터 타입으로 변경하거나
		//			다른 형태로 출력
		
		System.out.println(Integer.parseInt("-123"));	//String->int
		System.out.println(Integer.parseInt("FF", 16));	//0xFF->255
		
		System.out.println(Integer.toBinaryString(2019));//10진수->2진수
		System.out.println(Integer.toHexString(2019));//10진수->16진수
		System.out.println(Integer.toHexString(0b1111));
		
		//	형 변환
		double d3 = i2.doubleValue();	//	정수 i2를 double로 변환
		//	박싱과 언박싱\
		//	박싱
		Integer i3 = 2019;	//	JDK5 이후에는 자동으로 박싱된다.
		
		//	언박싱
		System.out.println(i3.intValue());
		
		
	}

}
