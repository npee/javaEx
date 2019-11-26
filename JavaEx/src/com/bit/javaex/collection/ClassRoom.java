package com.bit.javaex.collection;

public class ClassRoom {
	//	field
	private String subject;		//	과목명
	private String roomName;	//	강의실명
	
	//	constructor
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}
	
	//	method

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// subject가 같으면 같은 객체로 판단하자
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return other.hashCode() == hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 객체 식별 정수
//		return super.hashCode();
		//	subject 값을 이용하자
		return subject.hashCode();
	}
	
	
	
}
