package lesson003;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren programı yazalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++ ) {
			int multiplication = number * i;
			System.out.println(number + " x " + i + " = " + multiplication);
		}
		
		System.out.println("\n--------------\n");
		
		// iç içe for kullanarak çözelim. bütün çarpım tablosunu yazdıralım.
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}

	}

}
