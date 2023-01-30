package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// girilen TL değerini USDye çeviren program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("paranın TL değerini girin: ");
		float paraninTLDegeri = scanner.nextFloat();

		float dolarKuru = 18.90f;
		
		float paraninUSDDegeri = paraninTLDegeri / dolarKuru;
		
		System.out.println("Paranın USD değeri: " + paraninUSDDegeri);
		String ikiBasamak = String.format("USD değeri iki basamaklı: %.2f", paraninUSDDegeri);
		System.out.println(ikiBasamak);
				
		

	}

}
