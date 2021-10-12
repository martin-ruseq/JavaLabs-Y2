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
	private double roomNightRate;
	
	//empty constructor
	public HotelRoom()								
	{
		setNumber(0);	
		setType("");
		setOccupied(0);
		setRate(0.0);
	}
	
	//Overloaded constructor
	public HotelRoom(int num, String type, int stat, double rate)			
	{
		setNumber(num);
		setType(type);
		setOccupied(stat);
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
	
	public void setOccupied (int stat)
	{
		roomStatus = stat;
	}
	
	public void setRate (double rate)
	{
		roomNightRate = rate;
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
	
	public int getOccupied()
	{
		return roomStatus;
	}
	
	public double getRate()
	{
		return roomNightRate;
	}
	
	public boolean isOccupied()
	{
		if (roomStatus == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
