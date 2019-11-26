package com.bit.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName = "C:\\javastudy\\files";
	static String filename = dirName + "\\mytext.txt";
	
	public static void writeText( ) {
		//	새로 텍스트 파일을 만들고
		//		FileWriter를 이용해서ㅗ 텍스트 파일에
		//		내용을 저장
		try {
			//	Writer 생성 (Char Writer Stream 최고 조상)
			Writer writer = new FileWriter(filename);
			writer.write("Bit Computer\r\n");// /r/n
			writer.write("Java Programming\r\n");
			writer.write("2019.09\r\n");
			writer.flush();
			writer.close();
			
			System.out.println("텍스트 파일 기록");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readText() {
		//	mytext.txt로부터 문자를 읽어 와서 출력
		try {
			Reader reader = new FileReader(filename);
			int data = 0; //	임시저장용
			
			while((data = reader.read()) != -1) {
				System.out.println("Char : " + (char)data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// 
		//writeText();
		readText();
	}

}
