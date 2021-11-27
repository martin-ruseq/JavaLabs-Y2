package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			26/11/2021

public class Triangle extends TwoDShape
{
	private double base;
	private double height;
	
	//constructor
	public Triangle(String name, String color, double base, double height)
	{
		super(name, color);
		this.base = base;
		this.height = height;
	}
	//method calculating the area of triangle
	public double area()
	{
		return 0.5 * base * height;
	}
	//toString method
	public String toString()
	{
		return super.toString() + "\nBase: " + base + "\nHeight: " + height;
	}
}
