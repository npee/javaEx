package com.bit.javaex.basic.oper;

public class BitOperEx {

	public static void main(String[] args) {
		// 비트 연산
		// 하드웨어 제어, 이미지 프로세싱, ...
		// 미세한 단위 데이터를 제어할 때 사용
		// AND(&), OR(|), NOT(~), XOR(^)
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1 & b2 : " + Integer.toBinaryString(b1 & b2));
		System.out.println("b1 | b2 : " + Integer.toBinaryString(b1 | b2));
		System.out.println("~b1 : " + Integer.toBinaryString(~b1));
		
		// 비트 시프트
		// <<, >>, >>>
		int val = 1;
		//int val2 = -1;
		int val2 = 0b10000;
		System.out.println(val);
		// val을 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val << 1));
		System.out.println(Integer.toBinaryString(val << 4));
		System.out.println(Integer.toBinaryString(val >> 3));
		System.out.println(Integer.toBinaryString(val2 >> 3));
		System.out.println(Integer.toBinaryString(val2 >>> 3));
		

	}

}
