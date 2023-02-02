package lesson004;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadığını bulan program
		// bölenlerinin toplamı kendisini veren sayı
		// 6 -> 1,2,3

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı girin: ");
		int number = scanner.nextInt();

		int bolenToplami = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				bolenToplami = bolenToplami + i;
			}
		}
		if (number == bolenToplami) {
			System.out.println(number + " mükemmel bir sayıdır.");
		} else {
			System.out.println(number + " mükemmel bir sayı değildir.");
		}

	}

}
