package PracticeExtra01.q03;

import java.util.Scanner;

public class Question03 {
	public void printAnswer() {
		int num;
		Scanner scanner;
		
		System.out.println("정수를 입력하세요:");
			
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		
		//	TODO: 이곳에 코드를 작성합니다.
		for (int i = 2; i <= num; i++) {
			if (num % i == 0 && i != num) {
				System.out.printf("%d은 소수가 아닙니다.%n", num);
				break;
			} else if (i == num) {
				System.out.printf("%d은 소수입니다.%n", num);
			} else
				continue;
			
		}
		
			
	}
}
