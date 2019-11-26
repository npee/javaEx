package com.bit.javaex.oop.exception;

//	사용자 정의 예외의 생성
//		-> 예외 발생 시의 데이터를 담아서
//		catch 블록에서 어떤 데이터가 오류를 발생시켰는지
//		확인해 볼 수 있다
public class CustomArithException extends ArithmeticException {
	
	//	field - 오류 상황에서 발생한 데이터를 적재
	private int num1, num2;
	
	//	constructor
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//	Getters
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
}
