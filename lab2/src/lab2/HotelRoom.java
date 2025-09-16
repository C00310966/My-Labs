package lab2;

public class HotelRoom
{
	
	private int roomNumber;
	private String roomType;
	
	public HotelRoom() //Constructor method
	{
		
	}
	
	public void setNumber(int num) //Setter method
	{
		roomNumber = num;	
	}
	
	public void setType(String type)
	{
		roomType = type;
	}
	
	public int getNumber()
	{
		return roomNumber;
	}
	
	public String  getType()
	{
		return roomType;
	}
	
}