package ie.itcarlow.lab4;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			26/10/2021

public class Address
{
	private String empStreet;
	private String empCity;
	private String empCounty;
	
	//CONSTRUCTOR
	public Address (String street, String city, String county)
	{
		setEmpStreet(street);
		setEmpCity(city);
		setEmpCounty(county);
	}

	//SETTERS
	public void setEmpStreet(String empStreet)
	{
		this.empStreet = empStreet;
	}
	public void setEmpCity(String empCity)
	{
		this.empCity = empCity;
	}
	public void setEmpCounty(String empCounty)
	{
		this.empCounty = empCounty;
	}

	//GETTERS
	public String getEmpStreet()
	{
		return empStreet;
	}
	public String getEmpCity()
	{
		return empCity;
	}
	public String getEmpCounty()
	{
		return empCounty;
	}

	
	//METHODS
	public String toString()		// output full address of the employee as string
	{
		return "Emloyee Street: " + empStreet + "\n" + "Employee City: " + empCity + "\n" +  "Employee County: " + empCounty;
	}
}
