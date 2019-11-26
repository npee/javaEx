package PracticeExtra02.problem04;

public abstract class Shape {
	//	field
	protected int countSides;	//	변의 수
	
	//	constructor
	public Shape() {
		
	}
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	//	method
	public int getCountSides() {
		return countSides;
	}
	//	method(abstract)
	public abstract double getArea();
	public abstract double getPerimeter();
}
