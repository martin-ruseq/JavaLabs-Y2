package ie.itcarlow.lab5;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			03/11/2021

public class Circle extends Point
{
	private int radius;
	
	//constructor
	public Circle( int x, int y, int radius)
	{
		super(x, y);
		this.radius = radius;
	}

	//setters & getters
	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	//methods
	public String toString()
	{
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}

	
}
