package com.techelevator;

public class CheckingAccount extends BankAccount {
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		int newBalance = super.getBalance() - amountToWithdraw;
		if (newBalance <= -100) {
			// Transaction failed.  No change to balance.  Do nothing.
		} else if ((newBalance >= -89) && (newBalance < 0)) {
			// Transaction ok to process, but $10 overdraft charge will be assessed.
			super.withdraw(amountToWithdraw + 10);
		} else {
			// Simply process the transaction.
			super.withdraw(amountToWithdraw);
		}
		
		return super.getBalance();
	}
	
}
