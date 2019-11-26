package com.bit.javaex.thread.ex03;

public class DigitThread extends Thread {
	//	Runnable
	
	//	우클릭 > source > Override/Implement Methods... > run()
	public void run() {
		//	스레드의 실행 로직 위치
		//	1부터 30까지 정수를 순차적으로 출력
		for(int cnt = 0; cnt <= 30; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	//0.3초 지연
		}
	}
}
