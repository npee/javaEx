package com.bit.javaex.collection;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;

public class QueueEx {
	//	Queue
	//		First In First Out
	//		입력방향과 출력방향이 반대
	//		중간에 값을 넣고 뺄 수는 없다

	public static void main(String[] args) {
		//	Queue를 만들어 봅시다
		//	** Queue는 클래스가 아니라 Interface
		//		실체 클래스는 LinkedList의 저장 기능을 그대로 이용
		Queue<Integer> queue = new LinkedList<>();
		
		//	데이터 제공
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);			//	Stack의 push 기능
		}
		System.out.println("Queue : " + queue);
		System.out.println("PEEK : " + queue.peek());
		
		int out = queue.poll();
		System.out.println("POLL : " + out);
		System.out.println("Queue : " + queue);
		
		while (!queue.isEmpty()) {	//	Stack비우기와 약간 다른 메서드
			System.out.println("POLL : " + queue.poll());
			System.out.println("Queue : " + queue);
		}

	}

}
