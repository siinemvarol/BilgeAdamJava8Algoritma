package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//javada primitive tipler nelerdir
		//birbirinden farkı nedelerdir?
		
		//verilen isim ve soy isim değerlerini hello isim soyisim şeklinde yazdıralım
		
		String isim = "sinem";
		String soyisim = "varol";
		
		System.out.println("Hello " + isim + " " + soyisim);
		
		// Girilen isim ve soyismi yazdıralım
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("İsminizi girin: ");
		String isim2 = input.nextLine();
		
		System.out.println("Soyisminizi girin: ");
		String soyisim2 = input.nextLine();
		
		System.out.println("Girilen isim: " + isim2 + " " + soyisim2);
		

	}
}
