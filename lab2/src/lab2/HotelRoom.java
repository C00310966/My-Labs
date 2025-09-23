package lab2;

public class HotelRoom
{
	
	private int roomNumber;
	private String roomType;
	//private int vacancy;
	private boolean vacancy;
	private double rate;
	
	public HotelRoom() //Constructor method
	{
		
	}
	
	public HotelRoom(int num, String type, boolean vacancy, double cost )//constructor method which takes 4 arguments 
	{
		setNumber(num);
		setType(type);
		setVacancy(vacancy);
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
	
	public void isOccupied() //checks for room vacancy, if vacancy is true returns output of room occupied, if not occupied sets to occupied
	{
		if (vacancy) 
		{
			System.out.println("This room is occupied");	
		}
		else
		{
			setVacancy(true);
			System.out.println("This room is now occupied");
		}
	}
	
	public void setVacancy (boolean vacant)
	{
		vacancy = vacant;
	}
	
	public boolean getVacancy ()
	{
		return vacancy;
	}

	
/*public void setVacancy (int vacant)
	{
		vacancy = vacant;
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
	}*/
	
	public void setRate (double cost) 
	{
		rate = cost;
	}
	
	public double getRate()
	{
		return rate;
	}
}