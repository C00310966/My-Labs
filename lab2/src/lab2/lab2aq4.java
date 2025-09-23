package lab2;

public class lab2aq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotelRoom roomA = new HotelRoom(); //Constructs room object without arguments
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", false, 90);//Constructs room object with arguments
		
		roomA.setNumber(200);//sets values for variables in object
		roomA.setType("Single");
		roomA.setVacancy(false);
		roomA.setRate(100);
		
		roomB.setNumber(201);
		roomB.setType("Double");
		roomB.setVacancy(true);
		roomB.setRate(80);
		
		
		
		System.out.println("Room A: room number is " + roomA.getNumber() + ", room type is " + roomA.getType() + ", room is " + roomA.getVacancy() + " and the cost is "+ roomA.getRate() );
		System.out.println("Room B: room number is " + roomB.getNumber() + ",  room type is " + roomB.getType() + ", room is " + roomB.getVacancy() + " and the cost is "+ roomB.getRate() );
		System.out.println("Room C: room number is " + roomC.getNumber() + ",  room type is " + roomC.getType() + ", room is " + roomC.getVacancy() + " and the cost is "+ roomC.getRate() );
		//prints out the values of each variable in the object
		
		roomB.isOccupied(); //Checks if roomB is occupied
	}

}
