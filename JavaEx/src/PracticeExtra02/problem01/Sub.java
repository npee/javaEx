package PracticeExtra02.problem01;

public class Sub extends Operator {
	
	protected int x;
	protected int y;
	
	public void setValue(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public int calculate() {
		return x - y;
	}
}
