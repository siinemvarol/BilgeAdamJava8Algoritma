package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// Menu
		// 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		//   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//   eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi

		//   2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		//           giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer
		// kelimemiz
		//           içerisinde o harf varsa değiştirsin.

		//   3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		//          * olmadığını bulunuz(kek,iki,kabak,kayak)
		// 4 - programdan çıksın

		Scanner scanner = new Scanner(System.in);
		System.out.println("   --- String İşlemleri ---   ");
		System.out.println("1 - Kelimedeki harfleri saymak istiyorum");
		System.out.println("2 - Kelimedeki harfleri değiştirmek istiyorum");
		System.out.println("3 - Polindrom kontrolü");
		System.out.println("4 - Kelimenin harflerinin arasına ? koy");
		System.out.println("5 - Kelimenin ilk üç indexini alıp kalan karakterler yerine ... koyun");
		System.out.println("6 - Kelimenin ilk üç geri kalan harfler yerine ... koyun");

		int number = scanner.nextInt();
		scanner.nextLine();

		switch (number) {
		case 1:
			int sayac = 0;
			String indexler = "";
			System.out.println("Bir kelime girin: ");
			String kelime = scanner.nextLine();

			System.out.println("Bir harf girin: ");
			String harf = scanner.nextLine();

			if (!kelime.contains(harf)) {
				System.out.println("Aradığınız harf kelime içinde yoktur");
				break;
			} else {

				for (int i = 0; i < kelime.length(); i++) {
					if (kelime.charAt(i) == harf.charAt(0)) {
						sayac++;
						indexler += i + ", ";
					}
				}
				System.out.println(harf + " harfi " + kelime + " kelimesinde " + sayac + " kere geçmektedir.");
				System.out.println(
						harf + " harfinin bulunduğu indexler: " + indexler.substring(0, indexler.length() - 2));
			}

			break;

		case 2:
			System.out.println("Kelime girin");
			String kelime2 = scanner.nextLine();
			System.out.println("Değiştirmek istediğiniz harfi girin");
			String eskiHarf = scanner.nextLine();

			if (!kelime2.contains(eskiHarf)) {
				System.out.println("Değiştirmek istediğiniz harf kelime içinde yoktur");
				break;
			}

			System.out.println("Hangi harfle değiştirmek istediğinizi girin");
			String yeniHarf = scanner.nextLine();

			for (int i = 0; i < kelime2.length(); i++) {
				if (kelime2.charAt(i) == eskiHarf.charAt(0)) {
					kelime2 = kelime2.replace(eskiHarf, yeniHarf);
					System.out.println(kelime2);
				}
			}

			break;
		case 3:
			System.out.println("Bir kelime girin"); // K A B A K
			String kelime3 = scanner.nextLine();    // 0 1 2 3 4
			
			boolean polindrom = true;

				for (int i = 0; i < kelime3.length() / 2; i++) {					
						if (!(kelime3.charAt(i) == kelime3.charAt(kelime3.length() - i - 1))) {
							polindrom = false;											
							break;
				}

			}
				if (polindrom==true) {
					System.out.println("kelime palindrom");
					}
				else {
					System.out.println("palindrom değil");
				}
			

			break;

		case 4:
			StringBuilder stringBuilder = new StringBuilder();
			System.out.println("Bir kelime girin");
			String kelime4 = scanner.nextLine();

			for (int i = 0; i < kelime4.length(); i++) {
				stringBuilder.append(kelime4.charAt(i) + "?");
			}
			System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
			break;

		case 5:
			System.out.println("Bir kelime girin");
			String kelime5 = scanner.nextLine();
			String kelime6 = kelime5.substring(0, 3);
			String eklenecekSekil = "...";
			System.out.println(kelime6 + eklenecekSekil);

			break;

		case 6:
			System.out.println("Bir kelime girin");
			String kelime7 = scanner.nextLine();
			String kelime8 = "";
			for (int i = 0; i < kelime7.length(); i++) {
				if (i < 3) {
					kelime8 += kelime7.charAt(i);
				} else {
					kelime8 += ".";
				}
			}
			System.out.println(kelime8);

			break;

		default:
			System.out.println("Geçerli bir sayı girmediniz.");
			break;
		}
		System.out.println("Teşekkürler!");
	}

}
