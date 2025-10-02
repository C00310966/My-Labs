package lab3;

import java.util.Calendar;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE) );
		
		int startMinute = cal.get(Calendar.MINUTE); //Gets the starting minute
		int endMinute = startMinute; //Initialises the end minute to start for loop check
		
		while(startMinute == endMinute) //Checks minute to see if they are equal, then when minute increments by 1 loop ends
		{
			t.tick(); //Increments the second
			System.out.println(t.toString());//Prints out the current time
			endMinute = t.getMinute();//Gets the current minute every time the loop runs, when it gets a different minute the loop ends
		}
	}

}
