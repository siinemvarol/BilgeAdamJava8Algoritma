package lesson002;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// Kullanıcının burcunu bulma programı
		/*Koç Burcu : 21 Mart - 20 Nisan
          Boğa Burcu : 21 Nisan - 21 Mayıs
          İkizler Burcu : 22 Mayıs - 22 Haziran
          Yengeç Burcu : 23 Haziran - 22 Temmuz
          Aslan Burcu : 23 Temmuz - 22 Ağustos
          Başak Burcu : 23 Ağustos - 22 Eylül
          Terazi Burcu : 23 Eylül - 22 Ekim
          Akrep Burcu : 23 Ekim - 21 Kasım
          Yay Burcu : 22 Kasım - 21 Aralık
          1. Ay Oğlak Burcu : 22 Aralık - 21 Ocak
          1. Ay Kova Burcu : 22 Ocak - 19 Şubat
          Balık Burcu : 20 Şubat - 20 Mart
        // Kaçıncı ayda doğdunuz-->  4. ayda 
        // hangi gün doğdunuz-->  Ayın 20'sinde
        //Switch case kullanalım
        //Default --> lütfen 1-12 arasında bir sayı girin*/

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaçıncı ayda doğdunuz? (Lütfen 1-12 arası sayı girin)");
		int ay = scanner.nextInt();
		
		System.out.println("Hangi gün doğdunuz? (Lütfen 1-31 arası sayı girin)");
		int gun = scanner.nextInt();
		
//		String dogumAyi;
//		String dogumGunu;
//		
//		switch (ay) {
//		case 1:
//			dogumAyi = "Ocak";
//			break;
//		case 2:
//			dogumAyi = "Şubat";
//		default:
//			System.out.println("Lütfen 1-12 aralığında sayı girin");
//			break;
//		}

		switch (ay) {
		case 1:
			if (gun < 21) {
				System.out.println("Oğlak");
			}
			else {
				System.out.println("Kova");
			}
			break;
			
		case 2:
			if (gun < 19) {
				System.out.println("Kova");
			}
			else {
				System.out.println("Balık");
			}
			break;
			
		case 3:
			if (gun < 21) {
				System.out.println("Balık");
			}
			else {
				System.out.println("Koç");
			}
			break;
			
		case 4:
			if (gun < 21) {
				System.out.println("Koç");
			}
			else {
				System.out.println("Boğa");
			}
			break;
			
		case 5:
			if (gun < 22) {
				System.out.println("Boğa");
			}
			else {
				System.out.println("İkizler");
			}
			break;
			
		case 6:
			if (gun < 23) {
				System.out.println("İkizler");
			}
			else {
				System.out.println("Yengeç");
			}
			break;
			
		case 7:
			if (gun < 23) {
				System.out.println("Yengeç");
			}
			else {
				System.out.println("Aslan");
			}
			break;
			
		case 8:
			if (gun < 23) {
				System.out.println("Aslan");
			}
			else {
				System.out.println("Başak");
			}
			break;
			
		case 9:
			if (gun < 23) {
				System.out.println("Başak");
			}
			else {
				System.out.println("Terazi");
			}
			break;
			
		case 10:
			if (gun < 23) {
				System.out.println("Terazi");
			}
			else {
				System.out.println("Akrep");
			}
			break;
			
		case 11:
			if (gun < 23) {
				System.out.println("Akrep");
			}
			else {
				System.out.println("Yay");
			}
			break;
			
		case 12:
			if (gun < 22) {
				System.out.println("Yay");
			}
			else {
				System.out.println("Oğlak");
			}
			break;
			

		default:
			System.out.println("Lütfen istenen aralıklarda sayı girin");
			break;
		}
		
	}

}
