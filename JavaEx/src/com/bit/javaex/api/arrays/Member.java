package com.bit.javaex.api.arrays;

//	사용자 정의 클래스를 정렬하기 위해서는 Comparable 인터페이스를
//		구현해 줘야 한다.(implements Comparable)
public class Member implements Comparable {
			//	1. Member 오류 -> 인터페이스용 추상 메서드 구현
	protected String name;
	
	public Member (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override	//	2. 비교 작업을 직접 정의할 메서드 오버라이드
	public int compareTo(Object obj) {
		//	두 개의 객체를 비교하기 위해 compareTo 메서드에
		//		비교 방법을 기술해 줘야 한다
		//	name 필드를 대상으로 대소 비교
		if (obj instanceof Member) {	// 	3. 다운캐스팅 후
										//		String 비교연산
			//	다운캐스팅 가능
			Member other = (Member)obj;
			return name.compareTo(other.name);
			//	-1, 0, 1
			//	비교 대상이 동일한 경우 : 0
			//	비교 대상이 작은 경우 : -1
			//	비교 대상이 큰 경우 : 1
			
		}
		
		return 0;
	}

}
