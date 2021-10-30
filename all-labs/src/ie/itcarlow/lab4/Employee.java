package ie.itcarlow.lab4;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			26/10/2021

public class Employee
{
	private static int nextEmployeeId = 1000;		// employee number starts from 1000
	private static int countEmployees = 0;			// keep track of number of emplyees
	
	private int employeeId;
	private String employeeFirtsName;
	private Address empAddress;
	private String employeeLastName;
	private String employeeType;		// Manager or Staff
	private String carInfo;			// if employeeType = Manager
	
	
	//CONSTRUCTOR
	public Employee(String emplyeeFirtsName, String emplyeeLastName, Address address, String emplyeeType, String carInfo)
	{
		super();
		this.empAddress = address;
		this.employeeFirtsName = emplyeeFirtsName;
		this.employeeLastName = emplyeeLastName;
		this.employeeType = emplyeeType;
		this.carInfo = carInfo;
		this.employeeId = nextEmployeeId;
		nextEmployeeId++;
		countEmployees++;
	}

	//SETTERS
	public static void setNextEmployeeId(int nextEmployeeId)
	{
		Employee.nextEmployeeId = nextEmployeeId;
	}
	public static void setCountEmloyees(int countEmloyees)
	{
		Employee.countEmployees = countEmloyees;
	}
	public void setEmplyeeFirtsName(String emplyeeFirtsName)
	{
		this.employeeFirtsName = emplyeeFirtsName;
	}
	public void setEmplyeeLastName(String emplyeeLastName)
	{
		this.employeeLastName = emplyeeLastName;
	}
	public void setEmpAddress(Address empAddress)
	{
		this.empAddress = empAddress;
	}
	public void setEmplyeeType(String emplyeeType)
	{
		this.employeeType = emplyeeType;
	}
	public void setCarInfo(String carInfo)
	{
		this.carInfo = carInfo;
	}

	//GETTERS
	public static int getNextEmployeeId()
	{
		return nextEmployeeId;
	}
	public static int getCountEmloyees()
	{
		return countEmployees;
	}
	public String getEmplyeeFirtsName()
	{
		return employeeFirtsName;
	}
	public String getEmplyeeLastName()
	{
		return employeeLastName;
	}
	public Address getEmpAddress()
	{
		return empAddress;
	}
	public String getEmplyeeType()
	{
		return employeeType;
	}
	public String getCarInfo()
	{
		return carInfo;
	}

	//METHODS
	public String toString()
	{
		if(employeeType.equalsIgnoreCase("Manager"))
		{
			return "Employee ID: " + employeeId + "\n" + "Firts Name: " + employeeFirtsName + "\n" + "Last Name: " + employeeLastName
					+ "\n" + empAddress + "\n" + "Employee Type: " + employeeType + "\n" + "Emlyoyee Car: " + carInfo;
		}
		else
		{
			return "Employee ID: " + employeeId + "\n" + "Firts Name: " + employeeFirtsName + "\n" + "Last Name: " + employeeLastName + "\n" + empAddress
					+ "\n" + "Employee Type: " + employeeType;
		}
		
	}
	public static int NumberOfEmployees()		// output the number of employees
	{
		return countEmployees;
	}
}
