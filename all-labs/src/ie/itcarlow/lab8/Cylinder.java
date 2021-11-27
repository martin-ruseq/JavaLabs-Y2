package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			26/11/2021

public class Cylinder extends ThreeDShape
{
	private double radius;
	private double height;
	
	//constructor
	public Cylinder(String name, String color, double radius, double height)
	{
		super(name, color);
		this.radius = radius;
		this.height = height;
	}
	//method calculating area of cylinder
	public double area()
	{
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
	}
	//method calculating volume of cylinder
	public double volume()
	{
		return Math.PI * radius * radius * height;
	}
	//toString method
	public String toString()
	{
		return super.toString() + "\nRadius: " + radius + "\nHeight: " + height;
	}
}
