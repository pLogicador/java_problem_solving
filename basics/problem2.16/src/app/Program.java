// Problem 2.16
package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please, enter a first integer: ");
		int firstPromptNumber = sc.nextInt();
		
		System.out.print("Ok, now enter a second integer: ");
		int secondPromptNumber = sc.nextInt();
		
		if (firstPromptNumber > secondPromptNumber) {
			System.out.printf("%d is larger.%n", firstPromptNumber);
		} else if (firstPromptNumber == secondPromptNumber) {
			System.out.println("These numbers are equal.");
		} else {
			System.out.println("Was not thought!");
		}
		
		sc.close();
	}

}
