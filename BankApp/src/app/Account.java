package app;

public abstract class Account implements IBaseRate{
	
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
				
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public abstract void setRate();
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance + 
				"\nRATE: " + rate + "%"
				);
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void compound() {
		double accruedInterested = balance * (rate/100);
		balance += accruedInterested;
		System.out.println("Accrued Interest: $" + accruedInterested);
		printBalance();
	}
}
