package practice1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max = 0; int temp = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 : ");
			temp = s.nextInt();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.printf("최대값은 %d입니다.", max);
		
		s.close();
		
		

	}

}
