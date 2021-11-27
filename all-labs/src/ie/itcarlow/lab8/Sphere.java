package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			26/11/2021

public class Sphere extends ThreeDShape
{
	private double radius;
	
	//constructor
	public Sphere(String name, String color, double radius)
	{
		super(name, color);
		this.radius = radius;
	}
	//method calculating area of Sphere
	public double area()
	{
		return 4 * Math.PI * radius * radius;
	}
	//method calculatind the volume of Sphere 
	public double volume()
	{
		return 4 / 3.0 * Math.PI * radius * radius * radius;
	}
	//toString method
	public String toString()
	{
		return super.toString() + "\nRadius: " + radius;
	}
}
