package ie.itcarlow.lab3;



public class Lab3aQ3 
{

	public static void main(String[] args) 
	{
		BankCustomer customer1 = new BankCustomer("Joe Doe", "36 Old Forest, Buclody");
		BankCustomer customer2 = new BankCustomer("John Murphy", "65 The Willow, Arclow");

		
		customer1.addAccount1(5214.58);
		customer1.addAccount2(1164.78);
		customer1.addAccount3(782.23);
		
		customer2.addAccount1(435.54);
		
		System.out.println(customer1.printSummary());
		System.out.println("\n ########################################");
		System.out.println(customer2.printSummary());
		System.out.println("\n #####################################");
		System.out.println("\n Valid Savings Accounts: " + BankCustomer.getValidSavingsAccounts());
	}

}
