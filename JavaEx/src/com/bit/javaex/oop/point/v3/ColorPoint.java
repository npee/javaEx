package com.bit.javaex.oop.point.v3;
//	Point 클래스를 확장
public class ColorPoint	extends Point{
	//	부모가 가진 멤버 이외의 것들만 추가로 정의
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//	자식 생성자에서 특별한 조치를 하지 않으면
		//	부모의 기본생성자를 호출
		super(x, y);	// 부모가 가진 생성사 중 한 개를 반드시 호출
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//	메서드 오버라이딩
	//		-> 상속받은 메서드 중에서 부모의 기능을 이용하지 않고
	//		자체 기능을 다시 구현하고자 할 경우
	
	//@Override
	public void draw() {
		System.out.printf("색깔점(%s) [%d, %d]를 그렸습니다.%n",
				color, x, y);
	}
	
	@Override
	public void draw(boolean draw) {
		String message = String.format("색깔점(%s) [%d, %d]를 ",
				color, x, y);
		if (draw) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	
	}
	
}
