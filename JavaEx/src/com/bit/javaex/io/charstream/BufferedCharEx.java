package com.bit.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharEx {
	static String dirName = "C:\\javastudy\\files";
	static String source = dirName + "\\last-leaf.txt";
	static String target = dirName + "\\last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		//	last-leaf.txt에서 줄 단위로 읽어 와서
		//		해당 문장의 leaf or leaves가 들어 있는 문장만
		//		별도로 last-leaf-filtered.txt로 저장
		try {
			//	char 기반 입출력 스트림을 열 것이므로
			//		주 스트림인 FileReader/FileWriter 필요
			Reader reader = new FileReader(source);
			Writer writer = new FileWriter(target);
			
			//	보조스트림 연결
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(writer);
			
			String line = "";	//	임시 저장용 문자열
			while((line = br.readLine()) != null) {
				//	readLine() -> BufferedREader의 추가 메서드
				//	읽어올 내용이 없으면 null
				//	라인 내에 leaf of leaves 있는지 확인
				if (line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.write("\r\n");
				}			
			}
			System.out.println("필터링 완료!");
			br.close();
			bw.close();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
