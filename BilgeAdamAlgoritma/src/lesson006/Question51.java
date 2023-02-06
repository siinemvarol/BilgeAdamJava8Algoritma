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
		
		//String newText1 = "";
		
		for (int i = 0; i < turkceKarakter.length; i ++) {
			if (newText.contains(turkceKarakter[i])) {
				newText = newText.replace(turkceKarakter[i], ingilizceKarakter[i]);
			}
			System.out.println(newText);
		}
		
		
		
//		char ingilizceKarakter1 = ingilizceKarakter.charAt(0);
//		
//		
//		Scanner scanner =  new Scanner(System.in);
//		System.out.println("bir metin girin: ");
//		String text = scanner.nextLine();
//		
//		for (int i = 0; i < text.length(); i++) {
//			for (int j = 0; j < turkceKarakter.length; j ++) {
//				if (text.charAt(i) == (char) turkceKarakter[j]){
//				
//				
//			}
//			
//			
//		}
//	}

}
}
