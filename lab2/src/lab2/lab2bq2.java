package lab2;

public class lab2bq2 {

	public static void main(String[] args) {
		
	
	Rectangle rec1 = new Rectangle();
	rec1.setWidth(10);
	rec1.setLength(5);
	
	System.out.println("Length: " + rec1.getLength() + " Width: " + rec1.getWidth() ); //Print using get methods
	System.out.println(rec1.toString()); //Print using toString method
	
	System.out.println("Permeter: " + rec1.getPerimeter() );
	System.out.println("Area: " + rec1.getArea() );
	
	}
}
