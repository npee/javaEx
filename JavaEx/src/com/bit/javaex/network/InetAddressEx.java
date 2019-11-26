package com.bit.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	//	1. 내 로컬 IP 확인
	//	2. 도메인 네임으로 서버 IP 확인
	public static void printLocalIP() {
		//	InetAddress 클래스 : IP 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
//			Local : 내 PC...getLocalHost()는 예외처리 강제됨
			System.out.printf("Local IP : %s%n", local.getHostAddress());
//			getHostAddress()로 IP 가져오기			
			System.out.printf("Local Host : %s%n", local.getHostName());
//			getHostName()으로 내 PC 이름 가져오기			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void printServerIP(String hostname) {
		//	hostname으로 명명된 서버의 IP 확인
		try {
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			//	hostname에 연결된 모든 InetAddress 정보 반환
			
			//	배열 루프로 저장된 hostname, hostaddress 탐색
			for (InetAddress remote: addrs) {
				System.out.printf("%s's IP : %s%n",
						remote.getHostName(),
						remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		//	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printLocalIP();
		printServerIP("www.naver.com");
		printServerIP("www.google.com");
	}

}
