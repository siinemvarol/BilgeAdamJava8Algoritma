package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//verilen iki sayının çarpımını veren programı yazalım

		int sayi1 = 5;
		int sayi2 = 10;
		int carpim = sayi1 * sayi2;
		
		System.out.println("Girilen sayıların çarpımı: " + carpim);
		
		//Girilen iki sayının çarpımı
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int girilenSayi1 = input.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int girilenSayi2 = input.nextInt();
		
		int girilenSayilarinCarpimi = girilenSayi1 * girilenSayi2;
		System.out.println("Girlen sayıların çarpımı: " + girilenSayilarinCarpimi);			
		

	}

}
