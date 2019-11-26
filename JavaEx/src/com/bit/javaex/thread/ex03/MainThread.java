package com.bit.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		//	메인 스레드 로직
		//	A~Z까지 순차적으로 출력
			
		Thread dt = new DigitThread();
		
		dt.setPriority(Thread.MAX_PRIORITY);
		
		
		
		dt.start();	//	** run 메서드를 대신 호출한다
		//thread.run(); //	** 로직 자체가 수행되고 멀티쓰레드 되지않음
		
		/*	별도의 Thread : AlphabetThread로 분리
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			//	출력 속도 제한 : Thread.sleep()
			try {	//sleep()는 예외처리가 권장됨
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	//	0.3초 대기
		}
		
		*/
		//	Runnable 인터페이스로 만든 쓰레드는
		//		Thread 클래스에 생성자로 넘겨주고
		//		Thread를 실행시켜야 한다.
		Thread at = new Thread(new AlphabetThread());
		//	우선순위 부여
		at.setPriority(Thread.MIN_PRIORITY);
		at.start();
		
		try {
			dt.join();	//	DigitThread를 MainThread의 흐름에 합류시킴
			at.join();
			
		//	dt.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//	메인 스레드의 흐름에
		//	다른 스레드의 흐름을 합류(join)
		//	메인 스레드가 다른 스레드들이 모두 종료될 때까지
		//	각 스레드의 제어권을 유지할 수 있게 된다
		

		
		System.out.println("메인쓰레드 종료!");
		
		
	}
}
