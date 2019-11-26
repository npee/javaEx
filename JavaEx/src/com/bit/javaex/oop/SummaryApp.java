package com.bit.javaex.oop;
//	기본적으로 class나 interface등은 각자 개별 파일에 작성해주세요

abstract class Animal {
	//	추상 클래스이니 객체화는 불가
	
	//	field
	protected String name;
	protected int age;
	
	// constructor
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	//	method
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	
	public abstract void say();	//	반드시 Override
	
}

class Human extends Animal {
	//	constructor
	public Human(String name, int age) {
		// 적어도 하나의
		super(name, age);
	}
	
	//	추상 메서드 override
	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
}

class Panda extends Animal {
	//	constructor
	public Panda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		System.out.printf("zzz......");
	}
}



//	interface
interface Kungfu {
	public void kungfu();
}

interface Flyable {
	public void fly();
}




class KungfuPanda extends Panda implements Kungfu {
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + " : 아뵤~");
	}
}

class KungfuHuman extends Human implements Kungfu {
	//	constructor
	public KungfuHuman(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + " : I know kungfu!");
	}
}


class TheOne extends Human implements Kungfu, Flyable {
	//	상속은 단일 부모로부터만 받을 수 있지만
	//	인터페이스는 여러개 구현할 수 있다.
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println(name + ": 하늘을 날 수 있어요!");
		
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": 쿵푸를 할 수 있어요!");
	}
	


}


public class SummaryApp {


	public static void main(String[] args) {
		//	쿵후를 할 수 있는 배열(도장) 만들어
		Human h1 = new Human("홍길동", 28);
		Human h2 = new KungfuHuman("네오", 40);
		Panda p1 = new Panda("판다", 30);
		Panda p2 = new KungfuPanda("포", 15);
		TheOne neo = new TheOne("NEO", 40);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		fight(neo);
		
		//	쿵후 도장을 만들어 봅시다.
		//	같은 인터페이스를 구현한 객체는
		//		같은 인터페이스 타입으로 참조할 수 있다.
		Kungfu[] dojang = {
//				(Kungfu)h1,
				(Kungfu)h2,
//				(Kungfu)p1,
				(Kungfu)p2,
				(Kungfu)neo
		};
		
		neo.fly();
		
		
	}
	
	public static void fight(Animal a) {
		//	대련을 시켜봅시다
		//	객체가 인터페이스를 구현한 객체인지 먼저 확인
		if (a instanceof Kungfu) {
			((Kungfu)a).kungfu();	
		} else {
			System.out.println(a.name + " : 쿵후 못해요!");
		}	
	}
}
