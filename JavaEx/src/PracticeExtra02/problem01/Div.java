package PracticeExtra02.problem01;

public class Div extends Operator {
	
	protected int x;
	protected int y;
	
	public void setValue(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public int calculate() {
//		try {
			return x / y;
//		} catch (Exception e) {		
//			System.err.println("0으로 나눌 수 없습니다");
//			return 0;
//		}
		
	}

}
