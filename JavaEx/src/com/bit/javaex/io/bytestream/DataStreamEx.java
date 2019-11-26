package com.bit.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "C:\\javastudy\\files";
	static String filename = dirName + "\\primitives.txt";
	
	//	DataInputStream과 DataOutputStream
	//		기본 데이터 타입을 byte Stream으로 다루기 위한
	//		보조 스트림 클래스(변환 작업 대신 수행)
	public static void main(String[] args) {
		try {
			// 메인스트림
			OutputStream fos = new FileOutputStream(filename);
			//	-> 데이터 출력 스트림 만들기
			DataOutputStream dos = new DataOutputStream(fos);
			
			//	기본 데이터 출력
			//	String -> Boolean -> Int - Float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("장길산");
			dos.writeBoolean(false);
			dos.writeInt(102);
			dos.writeFloat(11.52f);
			
			dos.close();
			
			//	InputStream
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			//	읽어올 때는 출력한 순서에 맞게 읽어와야 한다.
			
			for (int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				Boolean b = dis.readBoolean();
				int j = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f%n", s, b, j, f);
			}
//				System.out.println(dis.readInt());
//				System.out.println(dis.readUTF());
//				System.out.println(dis.readBoolean());
//				System.out.println(dis.readFloat());
				
			dis.close();	
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
