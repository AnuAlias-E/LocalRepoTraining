package pack2;

import pack1.Circle;
import pack1.Shape;
import pack1.Square;

public class Main3 {
public static void main(String[] args) {
	
	Shape shape;
	
	shape=new Circle();
	shape.setSize(10);
	System.out.println(shape.getSize());
	System.out.println(shape.getArea());
	System.out.println("---------------------");
	

	shape=new Square();
	shape.setSize(10);
	System.out.println(shape.getSize());
	System.out.println(shape.getArea());
	System.out.println("---------------------");
	
	
}
}
