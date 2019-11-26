package com.bit.javaex.network.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
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
		//	3. 연결 대기
			Socket socket = serverSocket.accept();
			//	이 소켓은 통신용
		//	4. 클라이언트가 접속시 처리
		//		-> 접속한 클라이언트의 IP와 Port 정보를 출력
			InetSocketAddress client =
					(InetSocketAddress)socket.getRemoteSocketAddress();
			//	원격 소켓 주소를 가져와서 캐스팅
			System.out.println("[클라이언트가 연결되었습니다]");
			System.out.printf("%s : %d%n",
					client.getAddress(), client.getPort());
			//	클라이언트의 주소와 포트번호를 가져오기

		//	메시지 읽기
			//	먼저 Stream을 열어준다(소켓으로부터)
			InputStream is = socket.getInputStream();
			//	메인 스트림으로 Reader 연결
			Reader isr = new InputStreamReader(is, "UTF-8");
			//	보조스트림
			BufferedReader br = new BufferedReader(isr);
			
			//	Echo Back을 위한 OutputStream
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg;
		//	메시지 가져오기
			while(true) {
				msg = br.readLine();
				if (msg == null) {
					System.out.println("[접속이 종료되었습니다.]");
					break;
				}
				System.out.println("Message : "+ msg);
				
				//	Echo Back -> 응답 돌려주기
				System.out.println("Echo Back : " + msg);
				bw.write("[Echo] : " + msg);
				bw.newLine();
				bw.flush();
			}
			
		//	5. 후처리
			System.out.println("<서버 종료>");
			bw.close();
			br.close();
			
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
