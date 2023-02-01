package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Girilen sayıya kadar olan sayıların toplamını yazdıralım

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();
		int addition = 0;

		for (int i = 0; i <= number; i++) {
			addition = addition + i;
		}
		System.out.println("Addition of numbers until " + number + " (included) is: " + addition);

	}

}
