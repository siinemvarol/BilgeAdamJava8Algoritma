package lesson007;

import java.util.Scanner;

public class Question58 {

	private static int basamakSayisiBulma(int sayi) {
		String string = String.valueOf(sayi);
		int basamakSayisi = string.length();

		return basamakSayisi;

	}
	
	private static boolean bindenBuyukKontrol(int sayi2) {
		String string2 = String.valueOf(sayi2);
		int basamakSayisi2 = string2.length();
		
		if (basamakSayisi2 >= 4) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
		// girilen sayının kaç basamaklı olduğunu bulan metod yazalım
		// 1000 -> String'e çevirip lengthini alırsam basamağı bulurum

		// daha sonra farklı bir metotta sayının 1000'den büyük olup olmadığını kontrol
		// edelim

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı girin: ");
		int girilenSayi = scanner.nextInt();
		
		int bulunanBasamakSayisi = basamakSayisiBulma(girilenSayi);
		
		System.out.println("girilen sayının basamak sayısı: " + bulunanBasamakSayisi);
		
		boolean bindenBuyukKontrolSonucu = bindenBuyukKontrol(bulunanBasamakSayisi);
		
		System.out.println("girilen sayı binden büyük mü? : " + bindenBuyukKontrolSonucu);

	}



}
