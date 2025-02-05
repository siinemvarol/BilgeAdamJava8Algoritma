package com.sinemvarol;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static boolean devam = true;

	public static Televizyon tvKurVeKanallariOlustur() {

		System.out.println("TV markasını girin: ");
		String marka = scanner.nextLine();
		scanner.nextLine();
		System.out.println("TV boyutunu girin: ");
		String boyut = scanner.nextLine();
		Televizyon televizyon = new Televizyon(marka, boyut);
		televizyon.setKurulduMu(true);
		Main.menu();

		return televizyon;

	}

	public static void menu() {
		
		Televizyon televizyon = null;

		do {
			System.out.println("\n0 - Çıkış");
			System.out.println("1 - Televizyon Kur"); 
			System.out.println("2 - Televizyonu Aç");
			System.out.println("3 - Sesini Artır");
			System.out.println("4 - Sesi Azalt");
			System.out.println("5 - Kanal Değiştir");
			System.out.println("6 - Kanal Bilgisi Göster");
			System.out.println("7 - Televizyonu Kapat");
			System.out.println("8 - Menüyü Göster\n");

			System.out.println("Seçiminiz: ");
			int secim = scanner.nextInt();

			switch (secim) {
			case 0:
				System.out.println("\nKumanda kapatılıyor.\n");
				devam = false;
				break;
			case 1:
				if (Televizyon.kurulduMu == false) {
					televizyon = Main.tvKurVeKanallariOlustur();
				} else {
					System.out.println("TV zaten kurulu !");
				}
				break;
			case 2:
				Televizyon.tvAc();
				break;
			case 3:
				Televizyon.sesiAc();
				break;
			case 4:
				Televizyon.sesiAzalt();
				break;
			case 5:
				Televizyon.kanalDegistir();
				break;
			case 6:
				Televizyon.kanalBilgisiGoster();
				break;
			case 7:
				Televizyon.tvKapat();
				break;
			case 8:
				continue;

			default:
				System.out.println("\nHatalı tuşlama yaptınız.\n");
				break;
			}
		} while (devam);

	}

	public static void main(String[] args) {

		Main.menu();
	}

}
