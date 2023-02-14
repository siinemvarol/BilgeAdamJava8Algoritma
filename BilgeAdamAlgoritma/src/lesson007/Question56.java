package lesson007;

import java.util.Scanner;

public class Question56 {

	private static void isimSoyisimYazdirma(String isim, String soyisim) {
		System.out.println("İsim: " + isim + "\nSoyisim: " + soyisim);

	}

	public static void main(String[] args) {
		// parametre olarak girilen ismi ve soyismi alıp ekrana yazdıralım

		Scanner scanner = new Scanner(System.in);
		System.out.println("İsim girin: ");
		String girilenIsim = scanner.nextLine();
		System.out.println("Soyisim girin: ");
		String girilenSoyisim = scanner.nextLine();

		isimSoyisimYazdirma(girilenIsim, girilenSoyisim);

	}

}
