package lesson017;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOrnek2 {

	// 1 tane çift sayılar
	// 1 tane tek sayılar ArrayList'i oluşturalım

	// 1'den 100'e kadar 35 tane random sayı üretelim
	// tekleri tek, çiftleri çift listesine atalım

	public static void main(String[] args) {

		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();

		Random random = new Random();
		for (int i = 0; i < 35; i++) {
			int sayi = random.nextInt(0, 101);
			if (sayi % 2 == 0) {
				ciftSayilar.add(sayi);
			} else {
				tekSayilar.add(sayi);
			}
		}

		System.out.println(" - - tekSayilar - -");
		for (Integer sayi : tekSayilar) {
			System.out.print(sayi + ", ");
		}

		System.out.println("\n - - ciftSayilar - -");
		for (Integer sayi : ciftSayilar) {
			System.out.print(sayi + ", ");
		}

	}

}
