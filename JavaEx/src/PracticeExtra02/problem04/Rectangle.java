package PracticeExtra02.problem04;

public class Rectangle extends Shape implements Resizable{

	protected double width;
	protected double height;
	
	public Rectangle(double x, double y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;
	}

}
