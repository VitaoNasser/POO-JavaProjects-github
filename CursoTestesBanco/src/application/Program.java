package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y' || response == 'Y') {
			
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(accountNumber, accountHolder, initialDeposit);
			
		} else {
			
			bank = new Bank(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.printf("Enter an withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bank.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		System.out.println();
		
		sc.close();
	
		}
}