/*
	A box is valid only if all dimensions are positive, so the volume remains > 0.
	Q6. Create a BankAccount class with:
	accountNumber
	name
	balance
	Initialize these using a parameterized constructor.
	Create a method withdraw(int amount) that checks:
	Amount must be greater than 0
	Amount must be <= balance
	After withdrawal, update balance
	If invalid → print message accordingly
	Explanation:
	You must apply multiple logical checks together:
*/

class BankAccount
{
	int accountNumber;
	String name;
	int balance;
	
	BankAccount(int accountNumber, String name, int balance)
	{
		this.accountNumber= accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	void withdraw(int amount)
	{
		if(amount>0 && amount<=balance)
		{
			
			
			System.out.println("Account Number is : " +accountNumber);
			System.out.println("Name is : " +name);
			System.out.println("withdraw amount is : " +amount);
			System.out.println("Balance is is : " +balance);
			
			balance = balance-amount;
			System.out.println("After withdrawal, update balances "+ balance);
		}
		else
		{
			System.out.println("Invalid ");
		}
	}
}
class ConstructorQ6
{
	public static void main(String x[])
	{
		BankAccount bn = new BankAccount(1001, "Dhiraj" , 19700);
		bn.withdraw(12000);
		
		BankAccount bn1 = new BankAccount(1002, "Santosh" , 19700);
		bn1.withdraw(10000);
	}
}