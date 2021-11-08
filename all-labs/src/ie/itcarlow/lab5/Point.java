package ie.itcarlow.lab5;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			03/11/2021

public class Point
{
	protected int x;
	protected int y;

	//Consturctor
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	//Setters & Getters
	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	//Methods
	public String toString()
	{
		return "Pointer [x=" + x + ", y=" + y + "]";
	}
	
}


