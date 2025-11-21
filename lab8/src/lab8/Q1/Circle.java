package lab8.Q1;

public class Circle  extends TwoDShape{
	
	private double radius;

	public Circle(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nRadius = " + radius;
	}
	
}
