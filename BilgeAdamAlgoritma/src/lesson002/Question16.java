package lesson002;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// Kullanıcıdan aldığımız sayı haftanın hangi gününe denk geliyor
		// aldığımız gün hafta sonu mu hafta içi mi kontrol edelim
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı girin: ");
		int sayi = scanner.nextInt();
		
		String durum = "hafta ici";
		if (sayi%7 == 6 || sayi%7 == 0){
			durum = "hafta sonu";
		}
		
		switch (sayi%7) {
		case 1:
			System.out.println("Pazartesi");
			System.out.println(durum);
			break;
		case 2:
			System.out.println("Salı");
			System.out.println(durum);
			break;
		case 3:
			System.out.println("Çarşamba");
			System.out.println(durum);
			break;
		case 4:
			System.out.println("Perşembe");
			System.out.println(durum);
			break;
		case 5:
			System.out.println("Cuma");
			System.out.println(durum);
			break;
		case 6:
			System.out.println("Cumartesi");
			System.out.println(durum);
			break;
		case 0:
			System.out.println("Pazar");
			System.out.println(durum);
			break;

		default:
			System.out.println("koşullarda hata var");
			break;
		}
			

	}

}
