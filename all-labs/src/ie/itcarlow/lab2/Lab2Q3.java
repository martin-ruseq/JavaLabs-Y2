package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			12/10/2021
//Purpose: 			Create roomC and instantiates the instance variables with valuses.

public class Lab2Q3 
{

	public static void main(String[] args) 
	{
		HotelRoom roomC;
		
		roomC = new HotelRoom(202, "Single", 0, 90 );
				
		System.out.println("## Room C ##");
		System.out.println("Room number: " + roomC.getNumber());
		System.out.println("Room Type: " + roomC.getTyp());
		System.out.println("Room Status (0 = vacant ; 1 = occupied): " + roomC.getStatus());
		System.out.println("Room Nigtly Rate: " + roomC.getRate());
		System.out.println("");
	}

}
