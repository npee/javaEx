package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	// ArithmaticException
	public static void ArithExceptionEx() {
		//	상황 1 :
		//		Scanner로부터 정수를 입력받아
		//		100을 해당 정수로 나눈다
		
		double result = 0;
		Scanner s = new Scanner(System.in);
		
		//	오류 발생 가능 영역 시작
		System.out.print("정수 입력 : ");
		
		
		
		try {
			int num = s.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요:");
			System.out.println("ERROR : " + e.getMessage());
		} catch (ArithmeticException e) {
			//	ArithmeticException 발생했을 경우의 처리
			System.out.println("0으로 나눌 수 없어요:");
			System.out.println("ERROR : " + e.getMessage());
			
		} catch (Exception e) {
			//	Exception catch 블록은 맨 마지막에 위치
			//	-> Exception 클래스는 모든 예외를
			//		다 처리하기 때문에
			//		순서가 중요하다
			e.printStackTrace();
		} finally {
			//	예외 여부에 상관없이 항상 마지막에 실행
			System.out.println("Finally 실행");
		}
		
		
		
		
		
		System.out.println("결과 : " + result);
		//	오류 발생 가능 영역 끝
		
		
		s.close();
		
	}
	public static void arrayExceptionEx() {
		//	ArrayIndexOutOfBoundsException 테스트
		int intArray[] = {3, 6, 9};
		//	intArray의 length : 3
		//		intArray의 Index : 0 ~ 2
		System.out.println("길이 : " + intArray.length);
		
		try {
			intArray[4] = 12;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위는 " + intArray.length + " 까지입니다.");
			System.out.println("ERROR : " + e.getMessage());
		}
		
		
	}
	
	public static void main(String[] args) {
		//ArithExceptionEx();
		arrayExceptionEx();
	}
}
