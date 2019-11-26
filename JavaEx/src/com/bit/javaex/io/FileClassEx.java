package com.bit.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "C:\\javastudy\\files";
	//	File Class 예제
	public static void main(String[] args) {
		//	File 객체
		//		new File을 해도 실제 생성되는 것은 아니다
		//		해당 파일 정보를 확인하는 클래스
		File root = new File(dirName);
		//	존재여부 확인
		System.out.println(dirName + " : " + root.exists());
		//	파일 혹인 디렉토리를 만들고자 할 때
		//		해당 파일이 존재하는지 먼저 확인을 한 후 생성
		if (!root.exists()) {	//	디렉토리가 없으면
			root.mkdirs();		//	하위 디렉토리 일괄 생성
		}
		//	디렉토리 안에 새 파일 만들어 넣어봅시다
		File file = new File(dirName + "\\myfile.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				//	자동생성 사용(try/catch 강제됨)
				e.printStackTrace();
			}
		}
		
		//	지정된 디렉토리 내부의 정보를 출력하는 메서드
		printInfo(root);
		
		//	파일 지우기
		if (file.exists()) {
			file.delete();
		}
		printInfo(root);
		
		//	파일 닫기
		
	
	}
	static void printInfo(File f) {
		//	파일 정보를 넘겨받아서
		//		만약 디렉토리면 내부의 파일 목록 출력
		//		디렉토리가 아니면 파일의 속성을 출력
		System.out.println("File list");
		//	넘겨받은 파일이 디렉토리인지 확인
		if (f.isDirectory()) {
			//	디렉토리 파일목록 출력 기능
			File[] files = f.listFiles();	//	파일목록
			System.out.println("Directory : " + f.getName());
			//	목록 출력
			for (File file: files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.println(file.getName() + " " + file.length());
			} 			
		} else {
			//	디렉토리가 아니면
			System.out.println("File : " + f.getName());
		}
		
	}

}
