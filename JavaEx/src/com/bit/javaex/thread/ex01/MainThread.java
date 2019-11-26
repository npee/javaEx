package com.bit.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	메인 스레드 로직
		//	A~Z까지 순차적으로 출력
		Thread thread = new DigitThread();
		thread.start();	//	** run 메서드를 대신 호출한다
		//thread.run(); //	** 로직 자체가 수행되고 멀티쓰레드 되지않음
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			//	출력 속도 제한 : Thread.sleep()
			try {	//sleep()는 예외처리가 권장됨
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	//	0.3초 대기
		}
	}
}
