package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	//	Stack
	//		Last Input First Out
	//		입력방향과 출력방향이 같다
	//		중간에 값을 넣거나 뺄 수 없다
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//	Stack은 Vector를 상속해서 만듬 -> 버퍼가 있는 자료형
		//	루프를 돌면서 Stack에 값을 집어넣어 봅시다
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		System.out.println("Stack : " + stack);
		int out = stack.peek();
		System.out.println("가장 마지막 입력값 : " + out);
		System.out.println("Stack : " + stack);	//peek() : 데이터 추출 없음
		
		out = stack.pop();
		System.out.println("POP : " + out);
		System.out.println("STACK : " + stack);	//pop() : 데이터 추출
		
		//	루프를 돌면서 데이터를 pop
		while (!stack.empty()) {	//	EmptyStackException 주의
			//	비어있는 스택에서 데이터를 pop()할 경우 예외 발생
			System.out.println("POP : " + stack.pop());
			System.out.println("STACK : " + stack);
		}
		
		
	}

}
