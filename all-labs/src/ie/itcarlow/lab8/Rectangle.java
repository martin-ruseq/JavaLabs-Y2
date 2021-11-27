package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			26/11/2021

public class Rectangle extends TwoDShape
{
	private double width;
	private double height;
	
	//constructor
	public Rectangle(String name, String color, double width, double height)
	{
		super(name, color);
		this.width = width;
		this.height = height;
	}
	//method calculating the area of the ractangle
	public double area()	
	{
		return width * height;		//formula (W * H)
	}
	//toString method
	public String toString()
	{
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height;
	}
}
