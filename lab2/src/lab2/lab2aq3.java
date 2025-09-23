package lab2;

public class lab2aq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 1, 90);
		
		roomA.setNumber(200);
		roomA.setType("Single");
		roomA.setVacancy(1);
		roomA.setRate(100);
		
		roomB.setNumber(201);
		roomB.setType("Double");
		roomB.setVacancy(1);
		roomB.setRate(80);
		
		
		
		System.out.println("Room A: room number is " + roomA.getNumber() + ", room type is " + roomA.getType() + ", room is " + roomA.getVacancy() + " and the cost is "+ roomA.getRate() );
		System.out.println("Room B: room number is " + roomB.getNumber() + ",  room type is " + roomB.getType() + ", room is " + roomB.getVacancy() + " and the cost is "+ roomB.getRate() );
		System.out.println("Room C: room number is " + roomC.getNumber() + ",  room type is " + roomC.getType() + ", room is " + roomC.getVacancy() + " and the cost is "+ roomC.getRate() );
		
	}
	
}
