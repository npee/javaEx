package com.bit.javaex.io.charstream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
	static String dirName = "C:\\javastudy\\files"; 
	static String filename = dirName + "\\thieves.txt";
	
	public static void main(String[] args) {
		//	Scanner에 넘겨주기 위한 File의 정보
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s, 키 : %f, 체중 : %f%n", name, height, weight);
				scanner.nextLine();
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
