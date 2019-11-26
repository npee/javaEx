package PracticeExtra02.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int x, y;
    	char c;
    	String str;
    	String[] oper = new String[3];

    	while (true) {
        	System.out.print(">> ");
        	str = sc.nextLine();

        	if (str.equals("/q"))
        		break;
        	
        	oper = str.split(" ");

        	x = Integer.parseInt(oper[0]);
        	c = oper[1].charAt(0);
        	y = Integer.parseInt(oper[2]);
        	

    		switch (c) {
    			case '+':
    				Add a = new Add();
    				a.setValue(x, y);
    				System.out.printf(">> %d%n", a.calculate());
    				continue;
    			case '-':
    				Sub s = new Sub();
    				s.setValue(x, y);
    				System.out.printf(">> %d%n", s.calculate());
    				continue;
    			case '*':
    				Mul m = new Mul();
    				m.setValue(x, y);
    				System.out.printf(">> %d%n", m.calculate());
    				continue;
    			case '/':
    				Div d = new Div();
    				d.setValue(x, y);
    				System.out.printf(">> %d%n", d.calculate());
    				continue;
    			case '%':
					System.out.println("알 수 없는 연산입니다.");
    				continue;
				default :
					break;
    		}

    		break;
    	}
    	
    	sc.close();
    	System.out.println("종료합니다.");


    }
}
