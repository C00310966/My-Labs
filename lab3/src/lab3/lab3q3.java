package lab3;

public class lab3q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04); //changes interest rate for all
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		//used code from q2 to initialise accounts
		
		
		BankCustomer customer1 = new BankCustomer("Tom", "123 Yellow-Brick Road");//creates the customer with the given data
		customer1.addAccount(saver1);//adds the 2 accounts from above to the object
		customer1.addAccount(saver2);
		
		System.out.println(customer1); //prints out the object data
		System.out.println("Savings Total: " + customer1.balance(customer1.getSavingsAccounts()));
		
	}

}
