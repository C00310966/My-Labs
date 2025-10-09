package lab3;

public class SavingsAccount 
{
	private int accountNumber; //unique account number for each instance
	private static int nextAccNumber = 0; //used by all objects to get a unique number for each object
	private static double annualInterestRate;
	private double savingsBalance;
	private double monthInterest;
	
	public SavingsAccount(double savingsBalance) //constructor method
	{
		nextAccNumber ++;
		accountNumber = nextAccNumber; 
		this.savingsBalance = savingsBalance;
		
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	
	public static void modifyInterestRate(double annualInterestRate) //modifies the interest rate for all instances
	{
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	public double getInterestRate()
	{
		return annualInterestRate; //returns the interest for all 
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
	
	public void calculateMonthlyInterest()
	{
		monthInterest = savingsBalance * (annualInterestRate / 12); //calculates monthly interest first then multiplies
		savingsBalance = savingsBalance + monthInterest; //adds monthly interest to balance
	}
	
	public String toString() 
	{
		return "Savings Account No: " + getAccountNumber() + ", Balance: " + getSavingsBalance();
	}
}
