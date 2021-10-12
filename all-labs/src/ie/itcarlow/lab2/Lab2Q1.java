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
		
		System.out.println("roomA " + "(room number is " + roomA.getNumber() + ", type is " + roomA.getTyp() + ")");
		System.out.println("roomB " + "(room number is " + roomB.getNumber() + ", type is " + roomB.getTyp() + ")");
		
	}

}
