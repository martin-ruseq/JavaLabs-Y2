package ie.itcarlow.lab8;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				26/11/2021

public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double area();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
