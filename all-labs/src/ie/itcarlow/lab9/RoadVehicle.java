package ie.itcarlow.lab9;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				02/12/2021

public abstract class RoadVehicle implements ImportDuty
{
	private int wheels;	    	// How many wheels it has
	private int passengers; 	// How many passengers it can carry
 
	
	//constructor empty
	public RoadVehicle() 
	{
 		this(0,0);	
	}
 
	// contructor overloaded
	public RoadVehicle(int w, int p) 
	{ 
		setWheels(w);
		setPass(p);
	}
 
	//setters & getters
	public void setWheels(int num) 
	{
		wheels = num;
	}
 
	public int getWheels() 
	{
		return wheels;
	}
 
	public void setPass(int num) 
	{
		passengers = num;
	}
 
	public int getPass() 
	{
		return passengers;
	}
}