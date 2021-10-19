package ie.itcarlow.lab3;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			19/10/2021

import java.util.Calendar;

public class Clock 
{

	public static void main(String[] args) 
	{		
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE));
		
		long current1 = System.currentTimeMillis();
		
		t.tick();
		
		while(t.getSecond() != 0)
		{
			long current2 = System.currentTimeMillis();
			
			if (current2 - current1 >= 1000)
			{
				t.tick();
				System.out.println(t.toString());
				current1 = current2;
			
			}
		}
		
		
	}

}
