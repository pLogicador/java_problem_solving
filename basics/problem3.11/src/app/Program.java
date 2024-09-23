package app;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Account ac1 = new Account("Joe Green", 50.00);
		Account ac2 = new Account("Maria Ribeiro", -7.53);
		
		displayAccount(ac1);
		displayAccount(ac2);
		System.out.println("-------------------");
		
		ac1.deposit(25.00);
		displayAccount(ac1);
		System.out.println("-------------------");
		
		ac1.withdraw(100.00);
		displayAccount(ac1);
		System.out.println("-------------------");
	}
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

}
