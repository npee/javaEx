package practice1;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 1000000;
		int money;

		boolean isTrue = true;
		Scanner s = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			int num = s.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("예금액>");
				money = s.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액>");
				money = s.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("잔고액>" + balance);
				break;
			case 4:
				isTrue = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println("프로그램 종료");
		s.close();
	}

}
