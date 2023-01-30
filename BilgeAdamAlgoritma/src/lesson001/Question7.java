package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen sayının tek mi çift mi olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int girilenSayi = scanner.nextInt();
		
		if (girilenSayi%2==0) {
			System.out.println("Girilen sayı çifttir");
		}
		else System.out.println("Girilen sayı tektir");		
		
		}
	
}
