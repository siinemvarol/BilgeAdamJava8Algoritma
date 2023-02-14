package lesson007;

import java.util.Scanner;

public class Question57 {

	private static int toplamaIslemi(int sayi1, int sayi2) {
		int sum;
		return sum = sayi1 + sayi2;

	}
	
	private static boolean ondanBuyukKontrol(int farkliSayi) {
		if (farkliSayi < 18) {
			return false;
		}		
		return true;
	}

	public static void main(String[] args) {
		// topla metodu yazalım. toplam sonucunu kontrol edelim (main'de olabilir)
		// toplamın 18'den büyük olup olmadığını bulalım (main'de olabilir.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayıyı girin: ");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();
		
		int toplam = toplamaIslemi(sayi1, sayi2);
		System.out.println("Girilen iki sayının toplamı: " + toplam);
		
		boolean kontrolSonucu = ondanBuyukKontrol(toplam);   // toplam yazdığım yerde toplamaIslemi(sayi1, sayi2) yazıyordu ama bu kısmı 
		System.out.println("Ondan büyük mü? " + kontrolSonucu);					// zaten yeni bir değişkene atamıştım

	}



}
