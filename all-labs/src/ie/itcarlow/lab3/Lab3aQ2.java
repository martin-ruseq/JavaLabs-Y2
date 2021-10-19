package ie.itcarlow.lab3;

public class Lab3aQ2 
{

	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.0);
		saver2.setSavingsBalance(3000.0);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver 1 [interes 4%]: " + saver1.toString() + "\n");
		System.out.println("Saver 2 [interes 4%]: " + saver2.toString() + "\n");
		
		SavingsAccount.modifyInterestRate(0.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver 1 [interes 5%]: " + saver1.toString() + "\n");
		System.out.println("Saver 2 [interes 5%]: " + saver2.toString());
	}

}
