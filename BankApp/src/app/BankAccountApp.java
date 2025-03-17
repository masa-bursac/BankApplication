package app;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\masa\\eclipse-workspace\\BankApplication\\BankApplication\\NewBankAccounts.csv";	
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for (String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")){
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		 }
		
		for (Account acc: accounts) {
			acc.showInfo();
			System.out.println("*****************");
		}
		
		//accounts.get((int)Math.random() * accounts.size()).deposit(1000);
	}

}
