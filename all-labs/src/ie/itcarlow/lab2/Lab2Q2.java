
package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			12/10/2021
//Purpose: 			Set Room Status and Room Nihtly Rate, 
//					and print the information about the rooms using appriopiate get method

public class Lab2Q2 
{

	public static void main(String[] args) 
	{
		
		HotelRoom roomA;
		HotelRoom roomB;
		
		roomA = new HotelRoom();
		roomB = new HotelRoom();
		
		roomA.setNumber(200);
		roomA.setType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		
		roomB.setNumber(201);
		roomB.setType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		System.out.println("## Room A ##");
		System.out.println("Room number: " + roomA.getNumber());
		System.out.println("Room Type: " + roomA.getTyp());
		System.out.println("Room Status (0 = vacant ; 1 = occupied): " + roomA.getOccupied());
		System.out.println("Room Nigtly Rate: " + roomA.getRate());
		System.out.println("");

		System.out.println("## Room B ##");
		System.out.println("Room number: " + roomB.getNumber());
		System.out.println("Room Type: " + roomB.getTyp());
		System.out.println("Room Status (0 = vacant ; 1 = occupied): " + roomB.getOccupied());
		System.out.println("Room Nigtly Rate: " + roomB.getRate());
		System.out.println("");
		
	}

}
