package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Girilen ortalamanın harf notuna göre geçip geçmediğinii bulan program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ortalamanızı giriniz: ");
		
		int ortalama = scanner.nextInt();
		
		if (ortalama > 100 || ortalama < 0) {
			System.out.println("Lütfen geçerli bir not girin");
		}
		
		else {
		if (ortalama >= 90) {
			System.out.println("Harf notu AA'dır");
		}
		else if (ortalama >= 80 && ortalama <90) {
			System.out.println("Harf notu BB'dir");
		}
		else if (ortalama >= 70 && ortalama < 80) {
			System.out.println("Harf notu CC'dir");
		}
		else if (ortalama >= 60 && ortalama < 70) {
			System.out.println("Harf notu DD'dir");
		}
		else System.out.println("Harf notu FF'tir. Dersten kaldınız");
		}

	}

}
