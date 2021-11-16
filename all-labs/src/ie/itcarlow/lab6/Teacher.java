package ie.itcarlow.lab6;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			08/11/2021

public class Teacher extends Person
{
	private static int numCourses = 0;
	private String courses[] = new String[5];
	
	//constuctor
	public Teacher(String name, String address)
	{
		super(name, address);
	}
	
	public boolean addCourse(String course)
	{
		courses[numCourses] = course;
		numCourses++;
		
		return true;
	}
	
	public boolean removeCourse (String course)
	{
		boolean result;
		result = false;
		
		for(int i = 0; i < numCourses; i++)
		{
			if (courses[i] == course)
			{
				courses[i] = "";
				
				for(int i2 = i; i2 < numCourses; i2++)
				{
					courses[i2] = courses[i2 + 1];
				}
				numCourses--;
				result = true;
			}
		}
		return result;
	}
	
	//method toString
	public String toString() 
	{
		return "Teacher: " + super.toString();
	
	}
}
