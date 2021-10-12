package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			12/10/2021
//Purpose: 			

public class Lab2Q4 
{

	public static void main(String[] args) 
	{
		HotelRoom roomB;
		
		roomB = new HotelRoom();
		
		roomB.setNumber(201);
		roomB.setType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		if (roomB.isOccupied() == false)
		{
			roomB.setOccupied(1);
		}
		
		if (roomB.isOccupied() == false)
		{
			roomB.setOccupied(1);
		}
	}

}
