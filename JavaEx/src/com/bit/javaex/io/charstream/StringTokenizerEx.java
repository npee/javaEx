package com.bit.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "C:\\javastudy\\files"; 
	static String filename = dirName + "\\thieves.txt";
	public static void main(String[] args) {
		// FileReader + BufferedReader + StringTokenizer
		try {
			// 	메인스트림
			Reader reader = new FileReader(filename);
			//	보조스트림
			BufferedReader br = new BufferedReader(reader);
			
			String thief = "";
			
			while((thief = br.readLine()) != null) {
				//System.out.println(thief);
				StringTokenizer st = new StringTokenizer(thief, " ");
				//문자열 분리
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token + ",");
					
				}
				System.out.println();
			}
		
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
