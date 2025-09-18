package lab2;

public class lab2aq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		roomA.setNumber(200);
		roomA.setType("Single");
		
		roomB.setNumber(201);
		roomB.setType("Double");
		
		
		
		System.out.println("Room A: room number is " + roomA.getNumber() + " and room type is " + roomA.getType() );
		System.out.print("Room B: room number is " + roomB.getNumber() + " and  room type is " + roomB.getType() );
		
	}

}
