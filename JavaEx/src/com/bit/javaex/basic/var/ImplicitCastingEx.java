package com.bit.javaex.basic.var;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 암묵적 캐스팅(Promotion)
		// 표현 범위가 좁은 데이터를 넓은 데이터로 변경할 때
		// java가 자동으로 캐스팅을 해준다
		byte b = 25;	// 1byte integer
		System.out.println("BYTE :" + b);
		
		short s = b;	// 2bytes integer
		// b는 1바이트이므로 short에 할당이 가능
		System.out.println("SHORT :" + s);
		
		int i = s;		// 4bytes integer
		System.out.println("INT :" + i);
		
		long l = i; 	// 8bytes integer
		System.out.println("LONG :" + l);
		
		float f = l;	// 4bytes realNumber
		System.out.println("FLOAT :" + f);
		
		char ch = 'A';
		//short s2 = ch;
		int i2 = ch;
		System.out.println((char)((int)ch + 5));

	}

}
