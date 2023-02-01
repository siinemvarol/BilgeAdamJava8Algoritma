package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulalım. do while ile yapalım
		// 127 --> 1 + 2 + 7 = 10

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		int basamakToplami = 0;
		int kalan = 0;

//		do {
//			kalan = number%10;
//			basamakToplami = basamakToplami + kalan; 
//			number = number / 10;
//			System.out.println("kalan:" + kalan);
//			System.out.println("güncel basamak toplamı:" + basamakToplami);
//		} while (number%10 > 0);
//
//		System.out.println("final basamak toplamı: " +basamakToplami);

		while (number % 10 > 0) {
			kalan = number % 10;
			basamakToplami = basamakToplami + kalan;
			number = number / 10;
			System.out.println("kalan:" + kalan);
			System.out.println("güncel basamak toplamı:" + basamakToplami);
		}
		System.out.println("final basamak toplamı: " + basamakToplami);

	}

}
