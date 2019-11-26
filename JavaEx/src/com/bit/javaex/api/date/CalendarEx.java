package com.bit.javaex.api.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//	캘린더의 획득
		Calendar now = Calendar.getInstance();
		//	캘린더는 new 로 생성할 수 없고
		//		getInstance() 메서드로 생성할 수 있다.
		Calendar custom = Calendar.getInstance();
		//	custom 캘린더의 날짜를 바꿔 봅시다
		custom.set(Calendar.YEAR, 2012);
		custom.set(Calendar.MONTH, 8); //	9월
		custom.set(Calendar.DATE, 24);
		
		
		//	set메서드를 이용, 년원일시분초를 일괄 변경할 수도 있다.
		custom.set(2012, 8, 24);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다%n"
				, now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1 ,
				now.get(Calendar.DATE));
		
		//	미래로 가봅시다
		Calendar future = Calendar.getInstance();
		//	10년 후 오늘로 가봅시다 : add 메서드
		future.add(Calendar.YEAR, 10);
		//System.out.println(future.get(Calendar.YEAR));
		System.out.printf("10년 후는 %d년 %d월 %d일 입니다%n"
				, future.get(Calendar.YEAR), future.get(Calendar.MONTH) + 1 ,
				future.get(Calendar.DATE));
		
		//	이 날은 무슨 요일일까
		System.out.println("요일 : " + future.get(Calendar.DAY_OF_WEEK));
		//	1 : SUNDAY, 2 : MONDAY, ...
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		switch (dow) {
		case Calendar.SUNDAY :
			System.out.println("일요일");
			break;
		case Calendar.MONDAY :
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY :
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY :
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY :
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY :
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY :
			System.out.println("토요일");
			break;
		}
		
	}

}
