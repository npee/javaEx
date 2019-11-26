package PracticeExtra02.problem04;

public class RectTriangle extends Shape {
	
	protected double width;
	protected double height;
	
	public RectTriangle(int countSides) {
		super(countSides);
	}
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}
