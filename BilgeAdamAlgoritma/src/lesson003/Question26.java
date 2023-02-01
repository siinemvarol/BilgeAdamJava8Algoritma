package lesson003;

public class Question26 {

	public static void main(String[] args) {
		// a'dan z'ye kadar olan harfleri yazdıralım

//		// Alternatif 1
//		char character = 'a';
//
//		for (character = 'a'; character <= 'z'; character++) {
//			System.out.println(character);
//		}
		
		System.out.println("\n----------\n");
		
		char ch;
		for (ch = 'a'; ch <= 'z'; ch ++) {
			System.out.println(ch);
		}
		
		System.out.println("\n----------\n");
		
		for(char i = 97; i <= 122; i++) {
			System.out.println(i);
		}

	}

}
