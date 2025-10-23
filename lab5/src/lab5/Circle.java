//Name: Cian Howard
//Date: 23/10/2025


package lab5;

public class Circle extends Point { //establishes that circle is a subclass of point and inherits its attributes and methods

	private int radius;

	//constructor
	public Circle(int x, int y, int radius) {
		super(x, y); //calls the constructor in point
		this.radius = radius;
	}

	//getters and setters
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
