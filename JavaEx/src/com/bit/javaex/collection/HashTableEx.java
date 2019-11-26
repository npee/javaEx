package com.bit.javaex.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
	//	Hashtable은 키-값의 쌍
	//		키를 기반으로 값을 검색(Hash 계열) -> 속도 빠름
	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<String, ClassRoom>();
		
		//	맵에 데이터 넣기
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("201", new ClassRoom("C++", "R201"));
		//	key 중복은 허용하지 않는다...덮어써버림
		//		나중에 put 한 객체가 Value로 사용됨
		
		System.out.println("Map : " + map);
		
		//	키가 있는지 확인 : containsKey
		System.out.println("KEY 101 : " + map.get("101"));
		System.out.println("KEY 501 : " + map.get("501")); // null
		
		//	키를 이용하여 값에 접근
		ClassRoom c = map.get("101");
		System.out.println("101 강의실 : " + c);
		
		//	값이 있는지 확인 : containsValue 
		System.out.println("containsValue : "
				+ map.containsValue("Java"));	//	false
		//	객체를 만들어서 넘겨줘야 한다...hashCode 확인 > equals
		//	Overriding...		
		System.out.println("containsValue : "
				+ map.containsValue(new ClassRoom("Java")));//	true
		
		//	Hashtable의 키 목록은 HashSet
		//	Hashtable 내의 키 Set을 반환 받은 후, iterator를 받을 수 있다
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
//			String key = it.next();
//			ClassRoom room = map.get(key);
			ClassRoom room = map.get(it.next());
			System.out.println("ROOM(it) : " + room);
		}
		
		map.clear();	// 맵 비우기
		System.out.println("Map : " + map);
	}
}
