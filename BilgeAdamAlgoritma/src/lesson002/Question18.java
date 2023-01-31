package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen char değeri alfabenin içinde var mı yok mu kontrol edelim
		// a-z arası ve A-Z arası alfabede. 1 2 3 /& . - karakterleri alfabede değil
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir karakter giriniz: ");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		
		if (asciiCode >= 65 && asciiCode <= 90) {
			System.out.println("Karakter alfabede yer alan büyük bir harftir");
		}
		else if (asciiCode >= 97 && asciiCode <= 122) {
			System.out.println("Karakter alfabede yer alan küçük bir harftir");
		}
		else {
			System.out.println("Girilen karakter alfabede yer almaz");
		}
	

	}

}
