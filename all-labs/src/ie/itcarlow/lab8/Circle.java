package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			26/11/2021

public class Circle extends TwoDShape
{
	private double radius;
	
	//constructor
	public Circle(String name, String color, double radius)
	{
		super(name, color);
		this.radius = radius;
	}
	//method calculating area of circle
	public double area()
	{
		return Math.PI * radius * radius;
	}
	//toString method
	public String toString()
	{
		return super.toString() + "\nRadius: " + radius;
	}
}

