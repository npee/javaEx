package com.bit.javaex.basic.reftype;

public class StringEx {
	
	public static void defineStr() {
		// 문자열 선언
		String str1;
		str1 = "Java";	// literal(code에 직접입력한 값)
		String str2 = "Java";
		String str3 = new String("Java");
		
		// 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		// 참조 타입(객체)에서 == 은 객체의 주소 비교다.(값x)
		
		// 값의 비교
		//  Java의 모든 객체는 .equals() 라는 값 비교 메서드가 있음
		System.out.println(str2.equals(str3));
		
	}
	public static void stringFormatEx() {
		// 포맷 문자 %d, %s, %f, %n ...
		//  -> String.format() or S.O.printf()
		String fruit = "사과";
		int total = 10, eat = 3;
		
		System.out.println(total + "개의 " + fruit + " 중에서 "
				+ eat + "개를 먹었다");
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n",
				total, fruit, eat);
	
		float rate = 1.2345f;
		// 현재 이자율은 1.23%입니다.
		String fmt = "현재 이자율은 %.2f%% 입니다%n";
		System.out.printf(fmt, rate);
		// 포맷으로 지정된 문자열은 재활용 가능
		String s = String.format(fmt, 1.5678f);
		System.out.println(s);
	
	}

	public static void main(String[] args) {
		// 
		//defineStr();
		stringFormatEx();
		
	}

}
