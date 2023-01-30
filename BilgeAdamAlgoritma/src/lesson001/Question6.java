package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kullanıcıdan alınan vize ve final notlarını hesaplayarak geçip geçmediğini hesaplayan program
		
		//vize %40
		//final %60
		//50ye büyük ve eşitse geçer, 50'den küçükse kalır
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Vize notunu girin: ");
		float vizeNotu = scanner.nextFloat();
		
		System.out.println("Final notunu girin: ");
		float finalNotu = scanner.nextFloat();
		
		float ortalamaNot = (vizeNotu*0.4f) + (finalNotu*0.6f);
		
		if (ortalamaNot >= 50) {
			System.out.println("Tebrikler, " + ortalamaNot + " ortalamayla geçtiniz.");
		}
		else System.out.println("Maalesef geçer not alamadınız. Notunuz: " +ortalamaNot);
				
			

	}

}
