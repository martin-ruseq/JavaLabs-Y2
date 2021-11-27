package ie.itcarlow.lab8;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				26/11/2021

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
