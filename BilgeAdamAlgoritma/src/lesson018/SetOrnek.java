package lesson018;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	// 2 tane set oluşturalım: tekrar edenler ve tekrar etmeyenler
	// kullanıcıdan bir kelime alalım
	// eğer tekrar eden harf varsa tekrarEdenler setine atalım
	// ve tekrarEtmeyenlerden çıkaralım

	// tekrarEdenler ve tekrarEtmeyenler yazdıralım

	// java
	// tekrarEdenler --> a
	// tekrarEtmeyenler --> j, v

	public static void main(String[] args) {

		Set<Character> tekrarEdenler2 = new HashSet<>();
		Set<Character> tekrarEtmeyenler2 = new HashSet<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("metin girin: ");
		String metin = scanner.nextLine();

		for (int i = 0; i < metin.length(); i++) {
			for (int j = i + 1; j < metin.length(); j++) {
				if (metin.charAt(i) == metin.charAt(j)) {
					tekrarEdenler2.add(metin.charAt(i));
				}
			}
			if (!tekrarEdenler2.contains(metin.charAt(i))) {
				tekrarEtmeyenler2.add(metin.charAt(i));
			}
		}

		System.out.println("tekrar etmeyenler: " + tekrarEtmeyenler2);
		System.out.println("tekrar edenler: " + tekrarEdenler2);

	}

}
