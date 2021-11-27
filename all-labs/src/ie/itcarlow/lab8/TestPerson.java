package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			27/11/2021

public class TestPerson
{
	public static void main(String[] args)
	{
		Person persons[] = new Person[2];
		
		Employee emp1 = new Employee("John Smith", 32.215);
		Student stu1 = new Student("Julia Rusiecka", "Cybercrime");
		
		persons[0] = emp1;
		persons[1] = stu1;
			
		System.out.println(persons[0].getName() + "\n" + persons[0].getDescription());
		System.out.println("");
		System.out.println(persons[1].getName() + "\n" + persons[1].getDescription());
		
	}
}