package com.techelevator;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw > 0) {
			int newBalance = super.getBalance() - amountToWithdraw;
			if (newBalance < 0) {
				// Not enough money.  Transaction failed.  No change to balance.  Do nothing.
			} else if ((newBalance < 150) && (super.getBalance() >= newBalance + 2)) {
				// Transaction ok to process, but $2 service charge will be assessed.
				super.withdraw(amountToWithdraw + 2);
			} else {
				// Simply process the transaction.
				super.withdraw(amountToWithdraw);
			}
		}
		return super.getBalance();
	}
}
