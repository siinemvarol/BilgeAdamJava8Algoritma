package lesson009;

import java.util.Scanner;

public class Question69 {

	// parametre olarak girilen harfe göre, ikinci harfi girilen harf ile aynı olan
	// şehirlerin
	// ilk üç harfini büyük bastıran metod

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	private static void illeriBul(char harf) {
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == harf) {

				String firstThree = iller[i].substring(0, 3).toUpperCase();

				System.out.println(firstThree);
			}

		}

	}

	// plakaBul(iller, "Ankara", "Karaman");
	// parametre olarak array ve sınırsız sayıda String olarak şehir alsın
	// girilen şehirlerin plakalarını yazdırsın

	private static void plakaBul(String[] array, String... il) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if (array[i].equals(il[j])) {
					if (i < 10) {
						System.out.println("plaka: 0" + (i + 1) + " " + array[i]);
					} else {
						System.out.println("plaka: " + (i + 1) + " " + array[i]);
					}
				}
			}
		}

	}

	// B harfi ile başlayan şehirlerin ilk 3 harfini alalım
	// metod parametre olarak dizi alsın, for each kullanalım

	public static void bIleBaslayanSehirler(String[] array) {
		for (String il : array) {
			if (il.startsWith("B")) { // il.charAt(0) da olabilirdi bu koşul
				String firstThree2 = il.substring(0, 3).toUpperCase();
				System.out.println(firstThree2);
			}
		}

	}

	// Sesli harfleri silip silinmiş halini return eden bir metod yazalım
	// metod string array dönecek, parametre almayacak
	// return edilen arrayi mainde yazdıralım

//	public static String[] sesliHarfleriSil() {
//		
//		String[] sonuc = new String[iller.length];
//		int counter = 0;
//		for (int i = 0; i < iller.length; i++) {
//			counter = 0;
//			for (int j = 0; j <iller[i].length(); j++) {
//				if ( switch (iller[i].charAt(j)) {
//						case 'a':
//							sonuc[]
//							break;
//
//						default:
//							break;
//						})
//		
//		
//		
//			}
//		}
//		return sonuc;
//	}

	public static void main(String[] args) {

		illeriBul('a');

		Scanner scanner = new Scanner(System.in);
		System.out.println("değer girin: ");
		String deger = scanner.nextLine();

		illeriBul(deger.charAt(0));

		plakaBul(iller, "Ankara", "Karaman", "Tekirdağ");

		System.out.println("------");
		bIleBaslayanSehirler(iller);

	}

}
