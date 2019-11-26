package com.bit.javaex.basic.var;

public class IntLongEx {
	public static void main(String[] args) {
		int intVal1;
		//int intVal2;

		
		intVal1 = 2019;
		//intVal2 = 1234567890123;
		
		System.out.println(intVal1);
		
		// long (8바이트 정수형)
		long longVal1 = 2019, longVal2 = 123456789012L;
		
		
		System.out.println(longVal1);
		System.out.println(longVal2);
		
		// 2진 8진 16진 데이터의 입력
		int bin, oct, hex;
		bin = 0b1100;
		oct = 072;
		hex = 0xFF;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}
