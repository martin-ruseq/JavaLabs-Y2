package ie.itcarlow.lab15;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			01/03/2022

public class Verifier
{
	public boolean verifyIntRange(int value) throws MyOutOfRangeException
	{
		int low = 1;
		int high = 100;
		boolean inRange = false;
		
		if (value < high || value > low)
		{
			inRange = true;
			return inRange;
		}
		else
		{
			throw new MyOutOfRangeException();
		}
	}
}
