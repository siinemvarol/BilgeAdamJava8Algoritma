package lesson006;

import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		// girilen metinde Türkçe karakterleri İngilizce karaktere çeviriyoruz

		Scanner scanner = new Scanner(System.in);

		System.out.println("kelime: ");
		String newText = scanner.nextLine();

		for (int i = 0; i < turkceKarakter.length; i++) {
			if (newText.contains(turkceKarakter[i])) {
				newText = newText.replace(turkceKarakter[i], ingilizceKarakter[i]);
			}

		}
		System.out.println(newText);

	}

}
