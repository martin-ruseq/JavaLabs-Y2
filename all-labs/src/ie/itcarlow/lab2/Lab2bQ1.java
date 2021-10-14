package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			14/10/2021
//Purpose:

public class Lab2bQ1 
{

	public static void main(String[] args) 
	{
		Rectangle fig;
		
		fig = new Rectangle();
		
		fig.setLength(40.0);
		fig.setWidth(40.0);
		
		System.out.println("Using Getter Method :");
		System.out.println("Length: " + fig.getLength() + ", Witht: " + fig.getWidth());
		System.out.println("");
		
		System.out.println("Using toString Method :");
		System.out.println(fig.toString());
		System.out.println("");
	}

}
