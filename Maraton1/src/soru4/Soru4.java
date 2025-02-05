package soru4;

import java.util.Scanner;

public class Soru4 {

	private static void geometrikHesaplayici() {
		int secim = Integer.MAX_VALUE;
		final double PI = 3.14159;

		do {
			System.out.println("* * * * * * * * * * *");
			System.out.println("Geometrik Hesaplayıcı");
			System.out.println("* * * * * * * * * * *");
			System.out.println("1. Kare alan hesaplama");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire çevre hesaplama");
			System.out.println("7. Çıkış");

			Scanner scanner = new Scanner(System.in);
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				System.out.println("Karenin bir kenar uzunluğunu girin: ");
				int kareKenarUzunlugu1 = scanner.nextInt();
				int kareninAlani = kareKenarUzunlugu1 * kareKenarUzunlugu1;
				System.out.println("Kenar uzunluğu girilen karenin alanı: " + kareninAlani);
				break;
			case 2:
				System.out.println("Karenin bir kenar uzunluğunu girin: ");
				int kareKenarUzunlugu2 = scanner.nextInt();
				int kareninCevresi = kareKenarUzunlugu2 * 4;
				System.out.println("Kenar uzunluğu girilen karenin çevresi: " + kareninCevresi);
				break;
			case 3:
				System.out.println("Dikdörtgenin kısa kenar uzunluğunu girin: ");
				int dikdortgenKisaKenar1 = scanner.nextInt();
				System.out.println("Dikdörtgenin uzun kenar uzunluğunu girin: ");
				int dikdortgenUzunKenar1 = scanner.nextInt();
				int dikdortgeninAlani = dikdortgenKisaKenar1 * dikdortgenUzunKenar1;
				System.out.println("Kenar uzunlukları girilen dikdörtgenin alanı: " + dikdortgeninAlani);
				break;
			case 4:
				System.out.println("Dikdörtgenin kısa kenar uzunluğunu girin: ");
				int dikdortgenKisaKenar2 = scanner.nextInt();
				System.out.println("Dikdörtgenin uzun kenar uzunluğunu girin: ");
				int dikdortgenUzunKenar2 = scanner.nextInt();
				int dikdortgeninCevresi = 2 * (dikdortgenKisaKenar2 + dikdortgenUzunKenar2);
				System.out.println("Kenar uzunlukları girilen dikdörtgenin çevresi: " + dikdortgeninCevresi);
				break;
			case 5:
				System.out.println("Dairenin yarıçapını girin: ");
				int daireninYaricapi1 = scanner.nextInt();
				double daireninAlani = PI * daireninYaricapi1 * daireninYaricapi1;
				System.out.println("Yarıçapı girilen dairenin alanı: " + daireninAlani);
				break;
			case 6:
				System.out.println("Dairenin yarıçapını girin: ");
				int daireninYaricapi2 = scanner.nextInt();
				double daireninCevresi = 2 * PI * daireninYaricapi2;
				System.out.println("Yarıçapı girilen dairenin çevresi: " + daireninCevresi);
				break;

			default:
				if (secim != 7) {
					System.out.println("Hatalı sayı girdiniz. Lütfen menüdeki sayılardan birini girin.");
				}
				break;
			}

		} while (secim != 7);
		System.out.println("Geometrik hesaplayıcı sonlandı!");

	}

	public static void main(String[] args) {
		geometrikHesaplayici();

	}

}
