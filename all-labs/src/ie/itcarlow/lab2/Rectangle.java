package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			14/10/2021
//Purpose: 

public class Rectangle 
{
		private double length;
		private double width;
		private double area;
		private double perimeter;
		
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
		
		public double getArea()
		{
			area = (length * width);
			
			return area;		
		}
		
		public double getPerimeter()
		{
			perimeter = (2 * length) + (2 * width);
			
			return perimeter;
		}
		
		//toString
		public String toString()
		{
			String myString;
			
			myString = "";
			myString += "\n Length: " + length; 
			myString += "\n Width: " + width;
			myString += "\n Area: " + getArea();
			myString += "\n Perimeter: " + getPerimeter();
			
			return myString;
		}
		

		
		
		
}
