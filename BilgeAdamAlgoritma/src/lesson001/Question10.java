package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Girilen üç sayıdan en büyük olanı yazdıran program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println("Birinci sayıyı girin: ");
		int sayi3 = scanner.nextInt();
		
		int max = 0;
		
		max = sayi1;
		
		if (sayi2 > sayi1) {
			if (sayi3 > sayi2) {
				max = sayi3;
			}
			else max = sayi2;
		}
		else if (sayi1 > sayi2) {
			if (sayi3 > sayi1) {
				max = sayi3;
			}
			else max = sayi1;
		}
		
		System.out.println("Max sayı: " + max);
						

		
		

	}

}
