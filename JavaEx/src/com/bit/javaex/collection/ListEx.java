package com.bit.javaex.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	
	//	List 인터페이스
	//		List는 설계도
	//		실제 클래스는 LinkedList, ArrayList 등으로 구현되어 있다
	//		LinkedList -> 중간에 값이 빈번하게 삽입, 삭제되는 경우
	//			효율적으로 사용
	//		ArraylList -> 맨 뒤에 값이 추가되는 경우,
	//			중간에서는 빈번하지 않을 경우 효과적
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		//List<String> list = new ArrayList<>();		//	교체 가능성
		
		//	객체 추가
		list.add("Java");	//	맨 마지막에 아이템 추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		//	객체 삽입
		list.add(2, "Linux");
		System.out.println("list : " + list);
		System.out.println("size of list : " + list.size());
		//	size는 잡을 수 있으니 용량(Capacity)는 확인할 수 없다.
		
		//	객체 삭제
		list.remove(2);			//	인덱스로 삭제
		list.remove("Python");	//	객체로 삭제
		list.remove("C#");
		
		System.out.println(list);
		
		//	루프
//		for (String item: list) {
//			System.out.println("Element : " + item);
//		}
		//	나중에 좀 더 나은 방식으로 루프
		//	-> Iterator
		Iterator<String> it = list.iterator();	// iterator 반환
		while(it.hasNext()) {//데이터를 더 가지고 있으면
			String item = it.next();
			System.out.println("Element(it) : " + item);
		}
		//	메모리 접근 효율이 더 좋음
		
		//	비우기
		list.clear();
		System.out.println("list : " + list);

	}

}
