package pack1;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		super();
		setRadius(radius);
	}

	public Circle() {
	
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [getRadius()=" + getRadius() + ", calculateArea()=" + calculateArea() + ", getSize()="
				+ getSize() + ", getArea()=" + getArea() + "]";
	}

	@Override
	public void setSize(int size) {
		setRadius(size);
	}

	@Override
	public int getSize() {
		
		return getRadius();
	}

	@Override
	public double getArea() {
		
		return calculateArea();
	}

}
