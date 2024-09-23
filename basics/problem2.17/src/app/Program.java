// Problem 2.17
package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter first integer: ");
		int firstPromptNumber = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		int secondPromptNumber = sc.nextInt();
		
		System.out.print("Enter third integer: ");
		int thirdPromptNumber = sc.nextInt();
		
		int sum = firstPromptNumber + secondPromptNumber + thirdPromptNumber;
		int product = firstPromptNumber * secondPromptNumber * thirdPromptNumber;
		int average = sum / 3;
		int min, max;
		
		if (firstPromptNumber >= secondPromptNumber && firstPromptNumber >= thirdPromptNumber) {
			max = firstPromptNumber;
		} else if (secondPromptNumber >= firstPromptNumber && secondPromptNumber >= thirdPromptNumber) {
			max = secondPromptNumber;
		} else {
			max = thirdPromptNumber;
		}
		
		if (firstPromptNumber <= secondPromptNumber && firstPromptNumber <= thirdPromptNumber) {
			min = firstPromptNumber;
		} else if (secondPromptNumber <= firstPromptNumber && secondPromptNumber <= thirdPromptNumber) {
			min = secondPromptNumber;
		} else {
			min = thirdPromptNumber;
		}
		
		System.out.println("\nResult:");
		System.out.printf("The sum between the values is: %d%n", sum);
		System.out.printf("The average between the values is: %d%n", average);
		System.out.printf("The product between the values is: %d%n", product);
		System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
		
		sc.close();

	}

}
