package pack1;

public class Square implements Shape{
	private int size;

	public Square(int size) {
		super();
		setSize(size);
	}

	public Square() {
		super();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double computeArea() {
		return this.size * this.size;
	}
	
	

	@Override
	public String toString() {
		return "Square [getSize()=" + getSize() + ", computeArea()=" + computeArea() + ", getArea()=" + getArea() + "]";
	}

	@Override
	public double getArea() {
	return	computeArea();
	}
}
