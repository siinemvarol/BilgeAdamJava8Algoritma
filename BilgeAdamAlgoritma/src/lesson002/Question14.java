package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// Girilen 3 sayıyı büyükten küçüğe sıralayan program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println("Üçüncü sayıyı girin: ");
		int sayi3 = scanner.nextInt();
		
		int enBuyuk = 0;
		int orta = 0;
		int enKucuk = 0;
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			enBuyuk = sayi1;
			if (sayi2 > sayi3) {
				orta = sayi2;
				enKucuk = sayi3;
			}
			else {
				orta = sayi3;
				enKucuk = sayi2;
			}
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3) {
			enBuyuk = sayi2;
			if (sayi1 > sayi3) {
				orta = sayi1;
				enKucuk = sayi3;
			}
			else {
				orta = sayi3;
				enKucuk = sayi2;
			}
		}
		else {
			enBuyuk = sayi3;
			if (sayi1 > sayi2) {
				orta = sayi1;
				enKucuk = sayi2;
			}
			else {
				orta = sayi2;
				enKucuk = sayi1;
			}
		}
		
		System.out.println("En büyük sayı: " + enBuyuk);
		System.out.println("Ortanca sayı: " + orta);
		System.out.println("En küçük sayı: " + enKucuk);
	}

}
