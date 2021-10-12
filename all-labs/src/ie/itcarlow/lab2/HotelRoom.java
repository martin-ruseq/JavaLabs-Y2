package ie.itcarlow.lab2;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			07/10/2021
//Purpose: 

public class HotelRoom 
{
	private int	roomNumber;
	private String roomType;
	private int roomStatus;
	private double nightRate;
	
	//empty constructor
	public HotelRoom()								
	{
		setNumber(0);	
		setType("");
		setStatus(0);
		setRate(0.0);
	}
	
	//Overloaded constructor
	public HotelRoom(int num, String type, int stat, double rate)			
	{
		setNumber(num);
		setType(type);
		setStatus(stat);
		setRate(rate);
	}
	
	//Setters
	public void setNumber(int num)
	{
		roomNumber = num;
		
	}
	
	public void setType (String type)
	{
		roomType = type;
	}
	
	public void setStatus (int stat)
	{
		roomStatus = stat;
	}
	
	public void setRate (double rate)
	{
		nightRate = rate;
	}
	
	//Getters
	public int getNumber()
	{
		return roomNumber;
	}
	
	public String getTyp()
	{
		return roomType;
	}
	
	public int getStatus()
	{
		return roomStatus;
	}
	
	public double getRate()
	{
		return nightRate;
	}
}
