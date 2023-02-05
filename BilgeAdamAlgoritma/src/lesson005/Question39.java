package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		
		// Random int sayı üretmeliyiz
		// Random sayı üretelim 0-100 arasında bunu ekrana yazdıralım
		// Sayı tahmin uygulaması yapalım. eğer kullanıcının girdiği sayı, random üretilen sayıdan az ise
		// artırın, fazla ise azaltın diyelim
		// doğru tahmmin ettiğinde kaçıncı denemede bulduğunu söyleyelim		
		
//		//Yöntem 1 : google'dan baktım
//		int min = 0;
//		int max = 100;
//		
//		int i = (int) Math.floor(Math.random() *(max - min + 1) + min);
//		System.out.println(i);
//		
//		// Yöntem 2 
//		Random random = new Random();
//		int randomNumber = random.nextInt(0,101);
//		System.out.println(randomNumber);
//		
//		// Yöntem 3
//		int rastgele = (int) (Math.random()*100);
//		System.out.println(rastgele);
		
		int randomNumber = (int) (Math.random()*100);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayı tahmininizi girin: ");
		
		boolean esitMi = false;
		int counter = 0;
		
		while(esitMi == false) {
			int tahmin = scanner.nextInt();
			counter ++;
			if (tahmin < randomNumber) {
				System.out.println("sayıyı arttırın");
				continue;
			}
			else if (tahmin > randomNumber) {
				System.out.println("sayıyı azaltın");
				continue;
			}
			else {				
				System.out.println("sayıyı buldunuz");
				System.out.println("deneme sayısı: " + counter);
				esitMi = true;
			}
		}		
		
	}

}
