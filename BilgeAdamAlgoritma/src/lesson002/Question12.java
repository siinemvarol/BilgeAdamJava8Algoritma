package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		// Dışarıdan iki tane sayısal değer alalım
		// iki sayının toplamı çift ise true değil ise false yazdıralım
		// en sonda sayıların toplamının yarısını yazdıralım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("İki sayı girin: ");
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		int toplam = sayi1 + sayi2;
				
		boolean deger = (toplam%2 == 0);
		System.out.println(deger);

		System.out.println(toplam/2f);
		
	}

}
