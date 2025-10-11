package lab3;

import java.util.Arrays;

public class BankCustomer {
	private String name;
	private String address;
	private SavingsAccount[] savingsAccounts = new SavingsAccount[3]; //declares and initializes an array that stores 3 accounts
	private int noOfAccounts = 0; //declares a variable showing that every customer starts with 0 accounts
	
	public BankCustomer(String name, String address) //constructor
	{
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public SavingsAccount[] getSavingsAccounts() { //returns the array of accounts
		return savingsAccounts;
	}

	public void setSavingsAccounts(SavingsAccount[] savingsAccounts) { //updates the array of accounts for an object
		this.savingsAccounts = savingsAccounts;
	}

	public int getNoOfAccounts() { //returns the number of accounts a customer has
		return noOfAccounts;
	}

	public void setNoOfAccounts(int noOfAccounts) { //updates the number of accounts a customer has
		this.noOfAccounts = noOfAccounts;
	}

	public void addAccount(SavingsAccount account) //method for adding an account to a customer object
	{
		if (getNoOfAccounts() >= 0 && getNoOfAccounts() < 3) //first checks that the users number of accounts is not greater than 3
		{
				savingsAccounts[getNoOfAccounts()] = account; //adds the new account in the array at the specified number
				setNoOfAccounts(getNoOfAccounts()+1); //increments the count of accounts
		}
		else 
		{
			System.out.print("Account limit reached!");
		}
	}
		
		public double balance(SavingsAccount[] savingsAccounts) //method calculates total for all accounts of a customer
			{
			double totalBalance = 0; //initialise balance to 0
			for(SavingsAccount acc: savingsAccounts) //iterates through each account in the array
				{
					if( acc != null) //if the index in the array is not empty i.e. there is an account there, it will add it to the total
					{
						totalBalance = totalBalance + acc.getSavingsBalance();
					}
				}
			return totalBalance; //returns the total balance of the added accounts
			}

		@Override
		public String toString() { //returns the content of an object in string format
			return "BankCustomer [name=" + name + ", address=" + address + ", savingsAccounts="
					+ Arrays.toString(savingsAccounts) + "]"; //array.toString returns the content of the array
		}
		
		
}

