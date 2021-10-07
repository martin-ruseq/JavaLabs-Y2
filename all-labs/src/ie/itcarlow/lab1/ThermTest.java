package ie.itcarlow.lab1;

// Student Name 	: Marcin Rusiecki
// Student Id Number: C00263263
// Date 			: 05/10/2021
// Purpose 			: 

public class ThermTest
{ // begin class ThermTest
	
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
	} // end main
} // end class ThermTest
