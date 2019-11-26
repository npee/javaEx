package practice1;

import java.util.Scanner;

public class Problem07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        while (true) {

            String retry;
            int num = (int) (Math.random() * 100) + 1;
            int inputNum;

            System.out.println("========================");
            System.out.println("    [숫자맞추기게임 시작]");
            System.out.println("========================");
            while (true) {
                System.out.print(">>");
                inputNum = sc.nextInt();
               
    			if (num > inputNum) {
    				System.out.println("up");
    			} else if (num < inputNum) {
    				System.out.println("down");
    			} else {
    				System.out.println("맞았습니다.");
    				break;
    			}

            }

            System.out.print("게임을 종료하시겠습니까?(y/n) >>");
            retry = sc.next();
            if ("y".equals(retry)) {
            	break;
            }
        }

        sc.close();
	}
	

}
