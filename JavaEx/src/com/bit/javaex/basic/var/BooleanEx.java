package com.bit.javaex.basic.var;

public class BooleanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리형(true, false)
		//
		boolean b1 = true;
		boolean b2 = false;
		boolean b3;
		
		b3 = b1 | b2;
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		// 두 개의 정수값이 있을 때 대소 비교를 해서
		// 논리값을 추출해 봅시디ㅏ
		
		boolean result;
		int i1 = 3, i2 = 5;
		
		result = i1 > i2;
		
		System.out.println(i1 + ">" + i2 + "? : " + result);
	}

}
