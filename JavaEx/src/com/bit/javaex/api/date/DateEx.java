package com.bit.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//	날짜를 얻어옴
		//	java.util 안에 있으므로 명시적으로 import
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println("현재시간 : " + nowStr);
		System.out.println(now.toLocaleString());	//deprecated
		//	다른 방식 사용해야한다.
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		
		//	DateFormat FULL, LONG, MEDIUM, SHORT
		
		//	SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 mm분 ss초");
		System.out.println("포매팅된 날짜 정보 : " + sdf.format(now));
	}

}
