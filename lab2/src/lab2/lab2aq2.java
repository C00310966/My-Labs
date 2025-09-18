package lab2;

public class lab2aq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		roomA.setNumber(200);
		roomA.setType("Single");
		roomA.setVacancy(1);
		roomA.setRate(100);
		
		roomB.setNumber(201);
		roomB.setType("Double");
		roomB.setVacancy(0);
		roomB.setRate(80);
		
		
		
		System.out.println("Room A: room number is " + roomA.getNumber() + ", room type is " + roomA.getType() + ", room is " + roomA.getVacancy() + " and the cost is "+ roomA.getRate() );
		System.out.print("Room B: room number is " + roomB.getNumber() + ",  room type is " + roomB.getType() + ", room is " + roomB.getVacancy() + " and the cost is "+ roomB.getRate() );
		
	
	}
}
