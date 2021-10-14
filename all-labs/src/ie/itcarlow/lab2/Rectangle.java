package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			14/10/2021
//Purpose: 

public class Rectangle 
{
		private double length;
		private double width;
		
		public Rectangle()
		{
			setLength(1);
			setWidth(1);
		}
		
		public Rectangle(double l, double w)
		{
			setLength(l);
			setWidth(w);
		}
		
		//setters
		public void setLength(double l)
		{
			if ((l < 0.0) || (l > 40.0))
			{
				length = 1;
			}
			else
			{
				length = l;
			}
			
		}
		
		public void setWidth(double w)
		{
			if ((w < 0.0) || (w > 40.0))
			{
				width = 1;
			}
			else
			{
				width = w;
			}
			
		}
		
		//getters
		public double getLength()
		{
			return length;
		}
		
		public double getWidth()
		{
			return width;
		}
		
		//
		public String toString()
		{
			String myString;
			
			myString = "Length = " + length + ", Width = " + width;
			
			return myString;
		}
}
