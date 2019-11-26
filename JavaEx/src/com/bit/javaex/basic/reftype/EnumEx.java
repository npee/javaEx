package com.bit.javaex.basic.reftype;

public class EnumEx {
	
	public static void enumTest() {
		DayOfWeek dow = DayOfWeek.WEDNESDAY;
		
		// DayOfWeek.WEDNESDAY
		// 열거 상수 이름과 순서 확인
		System.out.printf("Today is %s(%d)%n", dow.name(), dow.ordinal());
		System.out.println(dow);
		
		// 문자열을 가지고 있을 때, 해당 문자열과 일치하는
		//  열거 상수를 얻어오기
		DayOfWeek dow2 = DayOfWeek.valueOf("FRIDIAY");
		System.out.printf("Today is %s(%d)%n", dow2.name(), dow.ordinal());

	}
	 
	public static void enumTest2() {
		// switch 연습때 만들었던 내용을 enum으로
		DayOfWeek today = DayOfWeek.WEDNESDAY;
		String message;
		
		switch(today) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			message = "열공";
			break;
		case FRIDAY:
			message = "불금";
		case SATURDAY:
		case SUNDAY:
			message = "휴식";
		default:
			message = "?";
		}
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enumTest();
		enumTest2();
	}	

}
