package com.techelevator.account;

import java.util.ArrayList;
import java.util.List;

public class JGBankApp {

	public static void main(String[] args) {
		
		
		//Account account = new Account();   //parent
		
		CheckingAccount checking = new CheckingAccount();

		checking.setAccountNumber("ABC");
		System.out.println("Account: " + checking.getAccountNumber());
		checking.setAccountBalance(100.00);
		
	
		
		SavingsAccount savings = new SavingsAccount();
		savings.setAccountNumber("CDE");
	
		System.out.println("Account: " + savings.getAccountNumber());
		
		List<Account> accountList = new ArrayList<Account>();
		
		accountList.add(checking);
		accountList.add(savings);
		
		for (Account a : accountList) {
			System.out.println(a.getAccountNumber());
	
			if (a instanceof CheckingAccount  ) {     //tests to see if this specific account type equals checking
				((CheckingAccount) a).writeCheck(10000.00);
				System.out.println("I am a checking account!");

			}
		}
		
		
		Account myAccount = checking;    // casting is automagic
		CheckingAccount newAccount = (CheckingAccount) myAccount;   //casting is needed to get to a more4 specific type
		SavingsAccount newSavings = (SavingsAccount) myAccount;     //this is dangerous
		
		
		
		

	}

}
