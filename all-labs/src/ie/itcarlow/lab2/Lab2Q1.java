package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			12/10/2021
//Purpose: 			Instantiates two room objects, assign values and print out the
//					information of two rooms using getter method.

public class Lab2Q1 
{

	public static void main(String[] args) 
	{
		
		HotelRoom roomA;
		HotelRoom roomB;
		
		roomA = new HotelRoom();
		roomB = new HotelRoom();
		
		roomA.setNumber(200);
		roomA.setType("Single");
		roomB.setNumber(201);
		roomB.setType("Double");
		
		System.out.println("## Room A ##");
		System.out.println("Room number: " + roomA.getNumber());
		System.out.println("Room Type:" + roomA.getTyp());
		System.out.println("");

		System.out.println("## Room B ##");
		System.out.println("Room number: " + roomB.getNumber());
		System.out.println("Room Type:" + roomB.getTyp());
		System.out.println("");
		
	}

}
