package lab2;

public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;
	
	public Rectangle()
	{
		length = 1.00;
		width = 1.00;
	}

	public void setLength(double len)
	{
		if (len > 0 && len <= 40)
		{
			length = len;
		}
	}
	
	public void setWidth(double wid)
	{
		if (wid > 0 && wid <= 40)
		{
			width = wid;
		}
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "Length = " + length + " Width = " + width;
	}
	
	public double getPerimeter()
	{
		perimeter = (width*2) + (length*2);
		return perimeter;
	}
	
	public double getArea()
	{
		area = (width * length);
		return area;
	}
}
