package pack2;

import pack1.Circle;
import pack1.Square;

public class Main2 {
	public static void main(String[] args) {
		Square square = new Square();
		square.setSize(10);
		System.out.println(square.getSize());
		System.out.println(square.computeArea());
		
		Circle circle=new Circle(10);
		circle.setRadius(10);
		circle.calculateArea()
;		
}
}
