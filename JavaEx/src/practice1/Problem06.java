package practice1;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int result = 0;
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		
		for (int i = 0; i <= num; i++) {
			if (num % 2 == 0 && i % 2 == 0) {
				result += i;
			} else if (num % 2 == 1 && i % 2 == 1) {
				result += i;
			}
		}
		
		System.out.println("결과값 : " + result);
		s.close();
	}

}
