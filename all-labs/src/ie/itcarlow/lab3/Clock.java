package ie.itcarlow.lab3;

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
