package lab1;

public class lab1q1 {
//Name: Cian Howard
//Student Number: C00310966
//Date: 16/09/2025

	public static void main(String args[]) 
	{ 
		
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		double tempB;
		Thermometer thermB = new Thermometer(10.0);
		
		tempB = thermB.getCelsius();
		System.out.print("Temp. of Thermometer B is " + tempB);
	}
	
}
