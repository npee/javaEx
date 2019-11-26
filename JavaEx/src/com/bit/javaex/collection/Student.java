package com.bit.javaex.collection;

public class Student {
	//	field
	private String name;//	이름
	private int id;		//	학번
	
	//	constructor
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	//	method
	@Override //	우클릭 > source > Generate toString()
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	@Override	//	우클릭 > source > Override/Implement Methods...
	public boolean equals(Object obj) {	
		if (obj instanceof Student) {//	Object가 무엇인지 확인...Student!
			Student other = (Student)obj;	//	다운캐스팅
			return name.equals(other.name) && id == other.id;
		}
		
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// 객체를 식별하는 정수 숫자
		//	객체를 빠르게 검색하기 위한 코드 값
		//	만약 두 객체의 hashCode가 다르다 -> 다른 객체
		//	hashCoe가 일치할 경우 -> 내부 값을 추가로 비교한다(equals)
		
		return id;
		
	}
	
	
	
//	@Override	//	우클릭 > source > Generate hashCode(), equals()...
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
	
}
