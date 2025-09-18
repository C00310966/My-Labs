package lab2;

public class HotelRoom
{
	
	private int roomNumber;
	private String roomType;
	private int vacancy;
	private Boolean vacancyStatus;
	private double rate;
	
	public HotelRoom() //Constructor method
	{
		
	}
	
	public HotelRoom(int num, String type, int number, double cost )
	{
		setNumber(num);
		setType(type);
		setVacancy(number);
		setRate(cost);
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
	
	public Boolean isOccupied()
	{
		if (vacancyStatus == True) 
		{
			return False;	
		}
		else if (vacancy == 1)
		{
			return True;
			setVacancy()
		}
	}
	
	
	public void setVacancy (boolean roomVacancy)
	{
		vacancyStatus = roomVacancy;
	}
	
	public String getVacancy()
	{
		if (vacancy == 0)
		{
			return "Vacant";
		}
		else if (vacancy == 1)
		{
			return "Occupied";
		}
		return null;
	}
	
	public void setRate (double cost) 
	{
		rate = cost;
	}
	
	public double getRate()
	{
		return rate;
	}
}