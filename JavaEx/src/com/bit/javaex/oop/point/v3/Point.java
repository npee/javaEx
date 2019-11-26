package com.bit.javaex.oop.point.v3;

public class Point {
	protected int x;
	protected int y;
	
//	public Point() {
//		
//	}
	public Point(int x, int y) {
		// super(); // 생략된 상태
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("점[x=" + getX() + ", y=" + getY() + "]을 그렸습니다.");
	}
	public void draw(boolean show) {
		// 메소드 오버로딩
		//	같은 리턴 타입, 같은 이름의 메서드를 중복해서 선언하는 것
		//	메서드 인자값에 따라 조금씩 다른 기능을 수행하도록 만들 수 있다.
		//		boolean show == true -> 그렸습니다.
		//		boolean show == false -> 지웠습니다.
		
		//System.out.println("점[x=" + getX() + ", y=" + getY() + "]을 그렸습니다..");
		String message = String.format("점 [%d, %d]을 ", x, y);
		if (show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}

}
