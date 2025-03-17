package app;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "C:\\Users\\masa\\eclipse-workspace\\BankApplication\\BankApplication\\NewBankAccounts.csv";
			
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for (String[] accountHolder: newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}

}
