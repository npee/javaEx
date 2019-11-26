package com.bit.javaex.network.echo2;

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
import java.net.Socket;

public class ServerThread extends Thread {
	//	field
	private Socket socket;
	
	//	constructor
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
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
				System.out.println("<쓰레드 종료>");
				bw.close();
				br.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
