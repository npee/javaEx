package practice2;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sumOfNum = 0;
		int inputNum;
		
		for (int i = 0; i < 5; i++) {
			inputNum = s.nextInt();
			sumOfNum += inputNum;
		}

		System.out.println("평균은 " + sumOfNum / 5 + " 입니다.");
		s.close();
	}
}
