package ie.itcarlow.lab1;

// Student Name 	: Marcin Rusiecki
// Student Id Number: C00263263
// Date 			: 05/10/2021
// Purpose 			: 

public class Lab1Q1
{ // begin class ThermTest
	
	public static void main(String args[]) 
	{ // being main method
		
		double tempB;
		
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);		//Create second instance using second constructor

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		tempB = thermB.getCelsius();	//Store the value of Thermometer B in variable
		System.out.println("Temp. of Thermometer B is " + tempB);
		
	} // end main
} // end class ThermTest
