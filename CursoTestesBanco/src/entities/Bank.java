package entities;

public class Bank {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
		
	public Bank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		}
	
	public Bank(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber
				+ ", Holder: " 
				+ accountHolder
				+ ", "
				+ "Balance: $ "
				+ String.format("%.2f", balance);
	}
}
