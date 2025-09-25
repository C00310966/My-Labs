package lab2;

public class Rectangle {
	private int length;
	private int width;
	private int perimeter;
	private int area;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}

	public void setLength(int len)
	{
		if (len > 0 && len <= 40)
		{
			length = len;
		}
	}
	
	public void setWidth(int wid)
	{
		if (wid > 0 && wid <= 40)
		{
			width = wid;
		}
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "Length = " + length + " Width = " + width;
	}
	
	public int getPerimeter()
	{
		perimeter = (width*2) + (length*2);
		return perimeter;
	}
	
	public int getArea()
	{
		area = (width * length);
		return area;
	}
	
	public void printRectangle()
	{
		char rectangle[][]; //initialise array to store characters
		rectangle = new char[length][width]; //declares array rows and columns using rectangle width and length
		
		for (int row = 0; row < length; row++) 
		{
	        for (int col = 0; col < width; col++) 
	        {
	            rectangle[row][col] = ' ';
	        }
	    }
		
		for (int col = 0; col < width; col++)
		{
			rectangle[0][col] = '*'; //every column in the first row becomes *, i.e. top width
			rectangle[length-1][col] = '*';
		}
		
		for (int row = 0; row < length; row++)
		{
			rectangle[row][0] = '*'; //every row  in the first column becomes *, i.e. left length
			rectangle[row][width-1] = '*';
		}
		/*
		for (int row = 0; row < length - 1; row++)
		{
			rectangle[row][length - 1] = '*'; //every row  in the last column becomes *, i.e. right length
		}
		
		
		for (int col = 0; col < width - 1; col++)
		{
			rectangle[length - 1][col] = '*'; //every column in the last row becomes *, i.e. bottom width
		}*/
		
		for (int row = 0; row < length; row++)
		{
			
			for (int col = 0; col < width; col++)
			{
				System.out.print(rectangle[row][col]); 
			}
			System.out.println(" ");
		}
		
	}
}


