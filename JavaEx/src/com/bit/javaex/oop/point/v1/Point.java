package com.bit.javaex.oop.point.v1;

public class Point {
	private int x;
	private int y;
	
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
}
