package lab3;

public class SavingsAccount 
{
	private int accountNumber = 1;
	private static float annualInterestRate;
	private float savingsBalance;
	private float monthInterest;
	
	public SavingsAccount(float interestRate, float balance)
	{
		accountNumber = accountNumber + 1;
		annualInterestRate = interestRate;
		savingsBalance = balance;
		
	}
	
	public void calculateMonthlyInterest()
	{
		monthInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = savingsBalance + monthInterest;
	}
	
	public static void modifyInterestRate(float interestRate)
	{
		annualInterestRate = interestRate;
	}
}
