// Problem 2.15
package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter a first integer: ");
		int firstPromptNumber = sc.nextInt();
		
		System.out.print("Ok, now enter a second integer: ");
		int secondPromptNumber = sc.nextInt();
		
		System.out.println("\nResult:");
		System.out.printf("The sum between the operands is: %d%n", firstPromptNumber + secondPromptNumber);
		System.out.printf("The product between the operands is: %d%n", firstPromptNumber * secondPromptNumber);
		System.out.printf("The difference between the operands is: %d%n", firstPromptNumber - secondPromptNumber);
		System.out.printf("The quotient between the operands is: %d%n", firstPromptNumber / secondPromptNumber);
		
		sc.close();

	}

}
