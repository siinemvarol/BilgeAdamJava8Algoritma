package lesson007;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		// iki kez üst üste aynı sayı klavyeden girilene kadar döngü devam edecek
		// üst üste iki sayı girildiğindeo zamana kadar girilen sayıların ortalamalarını veren program
		// 1 2 5 9 8 7 7 -> son 7 programdan çıkış olacak, ortalama hesabına katılmayacak
		
		Scanner scanner = new Scanner(System.in);
		double number = 0;
		double sum = 0;
		double sonGirilenSayi = 0;
		int counter = 0;
		
		do {
			sonGirilenSayi = number;
			System.out.println("Bir sayı girin: ");
			number = scanner.nextInt();			
			sum += number;
			counter ++;
			
		} while (sonGirilenSayi != number);{
			
		}
		System.out.println("ortalama: " + ((sum-number)/(counter-1)));
	}

}
