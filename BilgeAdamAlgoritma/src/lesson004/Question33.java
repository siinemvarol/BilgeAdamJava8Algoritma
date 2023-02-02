package lesson004;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan en büyük ve en
		// küçüğü bulan program

		Scanner scanner = new Scanner(System.in);
//		System.out.println("1-100 arasında (100 dahil) birinci sayıyı girin: ");
//		int number1 = scanner.nextInt();
//		System.out.println("1-100 arasında (100 dahil) ikinci sayıyı girin: ");
//		int number2 = scanner.nextInt();
//		System.out.println("1-100 arasında (100 dahil) üçüncü sayıyı girin: ");
//		int number3 = scanner.nextInt();
//		System.out.println("1-100 arasında (100 dahil) dördüncü sayıyı girin: ");
//		int number4 = scanner.nextInt();
//		System.out.println("1-100 arasında (100 dahil) beşinci sayıyı girin: ");
//		int number5 = scanner.nextInt();

		int max = -1;
		int min = 101;
		int i=0;
		int number;
		while (i<5) {
			System.out.println("sayı girin: ");
			number = scanner.nextInt();
			
			if (number <= 100 && number >= 0) {
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
				i++;
			} else {
				System.out.println("lütfen geçerli sayı girin");
			}		
		}
		System.out.println("girilen sayıların maximumu: " +max);
		System.out.println("girilen sayıların minimumu: " +min);
		
		

	}
}
