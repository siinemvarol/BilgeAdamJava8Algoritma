package lesson019;

import java.util.Scanner;

public class OyunuBaslat {

	public static void menu() {
		PlakaTahmin plakaTahmin = new PlakaTahmin();
		
		String message = "Şehir Tahmin Oyununa Hoşgeldiniz" + "\nOyunumuzda toplam 3 tahmin hakkınız bulunmaktadır." + 
				"\n1- Oyuna başla" + "\n2- Tahminlerim" + "\n0- Çıkış ";
		
		int input;
		
		do {
			System.out.println("- - - - - - - - - - - - - -");
			System.out.println(plakaTahmin.oyunSayisi + ". oyun");
			System.out.println(message);
			Scanner scanner2 = new Scanner(System.in);
			input = scanner2.nextInt();
			
			
			switch (input) {
			case 1:
				plakaTahmin.tahmin();
				break;
			case 2:
				plakaTahmin.tahminListem();
				break;
			case 0:
				System.out.println("Çıkış yaptınız.");
				break;

			default:
				break;
			}
			
		} while (input!=0);
	}

}
