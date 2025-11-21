package lab8.Q1;

public class Rectangle extends TwoDShape {
	
    private double width;
    private double height;

    public Rectangle(String name, String colour, double width, double height) {
        super(name, colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth = " + width + "\nHeight = " + height;
    }
}
