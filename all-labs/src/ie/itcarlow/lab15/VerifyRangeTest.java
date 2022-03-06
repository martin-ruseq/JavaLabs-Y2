package ie.itcarlow.lab15;

import java.util.Scanner;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			01/03/2022

public class VerifyRangeTest
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		do
		{
			try
			{
				System.out.print("Please enter an integer");
				int number = sc.nextInt();
			}
			catch (Verifier MyOutOfRangeException)
			{
				
			}
		}
		while (loop);
	}
}
