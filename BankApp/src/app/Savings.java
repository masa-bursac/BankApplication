package app;

public class Savings extends Account {
	
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("ACCOUNT NUMBER: " + accountNumber);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
}
