package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		// Dairenin çevresini ve alanını hesaplayan bir program. r değerini kullanıcıdan alsın. Pi = 3.14
		
		float PI = 3.14f;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		int r = scanner.nextInt();
		
		if (r <= 0) {
			System.out.println("Sıfırdan büyük bir değer giriniz");
		}
		else {
		float cevre = 1f * 2 * PI * r;
		float alan = 1f * PI * r * r;
		
		System.out.println("Yarıçapı girilen dairenin çevresi: " + cevre);
		System.out.println("Yarıçapı girilen dairenin alanı: " + alan);
		}
	}

}
