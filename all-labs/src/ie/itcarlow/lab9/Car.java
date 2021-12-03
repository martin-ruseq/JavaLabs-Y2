package ie.itcarlow.lab9;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				02/12/2021

public class Car extends RoadVehicle implements ImportDuty
{
	private String carType;
	private double carPrice;
 
	//contructor empty
	public Car() 
	{
	 	this("", 0, 0, 0.0);
	}
 
	//contructor overloaded
	public Car(String c, int w, int p, double v) 
	{ 
		super(w, p);		//invoke parent constructor
		setType(c);	
		setPrice(v);
	}
	
	//setters & getters
	public void setType(String t)  
	{
		carType = t;
	}
	public String getType() 
	{
		return carType;
	}
	public void setPrice(double value)
	{
		carPrice = value;
	}
	public double getPrice() 
	{
		return carPrice;
	}
	
	//interface method
	public double calculateDuty()
	{
		return CARTAXRATE * carPrice;
	}
}