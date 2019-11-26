package com.bit.javaex.network.echo2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 절차
		//	1. ServerSocket 생성
		ServerSocket serverSocket = null;	//	연결용. 데이터용 아님
		
		try {
			serverSocket = new ServerSocket();
		//	2. 바인드 작업 (IP, Port를 ServerSocket에 연결)
			InetSocketAddress local = 
					new InetSocketAddress("127.0.0.1", 10000);
		//	127.0.0.1 : 내 PC
			serverSocket.bind(local);
			
			System.out.println("<서버 시작>");
			System.out.println("[연결 대기중입니다]");
		//	3. 연결 대기 /* 수정 (while 추가) */
			while(true) {
				//	연결 될 때마다 쓰레드 대기
				Socket socket = serverSocket.accept();
				//	이 소켓은 통신용
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			/* ServerThread.java 로 이동됨 */
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//	ServerSocket 닫기
			try {	//	닫다가 에러가 뜨는 경우가 있으므로
					//	예외처리 강제됨
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
