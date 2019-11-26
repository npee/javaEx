package com.bit.javaex.thread.ex03;

public class AlphabetThread implements Runnable{
	//	클래스명 에러 -> run 메서드 오버라이드 필요
	
	//	Runnable 인터페이스를 구현한 쓰레드 클래스
	@Override
	public void run() {
		
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
