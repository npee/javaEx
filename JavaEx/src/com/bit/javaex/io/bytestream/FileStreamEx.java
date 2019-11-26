package com.bit.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	//	FileInputStream과 FileOutputStream
	static String dirName = "C:\\javastudy\\files"; 
	static String source = dirName + "\\img.jpg";
	static String target = dirName + "\\img_copy.jpg";
	public static void main(String[] args) {
		//	source 파일을 FileInputStream으로 열어서
		//	target 파일로 복사(FileOutputSTream)
		try {
			//	Stream 열기
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
		
			int data = 0;	//	임시 저장용
			//	InputStream으로부터 데이터를 불러와서
			//	OutputStream으로 저장
			while ((data = is.read()) != -1) {
				System.out.print("*");
				os.write(data);
				//	1byte 단위로 복사를 시도 -> 효율상 문제
				//	보조 스트림 추가(BufferdInputStream)
				//	TODO: 버퍼 방식으로 변경해 볼 예정
				
			}
			//	Stream 닫기
			os.close();
			is.close();
			System.out.println("파일을 복사했어요!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
