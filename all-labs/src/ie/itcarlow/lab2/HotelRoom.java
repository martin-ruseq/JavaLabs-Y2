package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			07/10/2021
//Purpose: 

public class HotelRoom 
{
	private int	roomNumber;
	private String roomType;
	
	public HotelRoom()								// constructor method #1
	{
		setNumber(0);	
		setType("");
	}
	
	public HotelRoom(int num, String type)			// constructor method #2
	{
		setNumber(num);
		setType(type);		
	}
	
	public void setNumber(int num)
	{
		roomNumber = num;
		
	}
	
	public void setType (String type)
	{
		roomType = type;
	}
	
	public int getNumber()
	{
		return roomNumber;
	}
	
	public String gettyp()
	{
		return roomType;
	}
}
