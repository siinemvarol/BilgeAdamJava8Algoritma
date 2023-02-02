package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		//  Menu 
		//  1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		//  harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//  eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		
		//  2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		//          giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		//          içerisinde o harf varsa değiştirsin.
		
		//  3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		//         * olmadığını bulunuz(kek,iki,kabak,kayak)
		// 4 - programdan çıksın

		Scanner scanner = new Scanner(System.in);
		System.out.println("   --- String İşlemleri ---   ");
		System.out.println("1 - Kelimedeki harfleri saymak istiyorum");
		System.out.println("2 - Kelimedeki harfleri değiştirmek istiyorum");
		System.out.println("3 - Polindrom kontrolü");
		System.out.println("4 - Çıkış");
		
		int number = scanner.nextInt();
		scanner.nextLine();
		
		switch (number) {
		case 1:
			int sayac = 0;
			String indexler = "";
			System.out.println("Bir kelime girin: ");
			String kelime = scanner.nextLine();
			
			System.out.println("Bir harf girin: ");
			String harf = scanner.nextLine();
			
			if(!kelime.contains(harf)) {
				System.out.println("Aradığınız harf kelime içinde yoktur");
				break;
			}
			
			for (int i = 0; i<kelime.length(); i++) {
				if(kelime.charAt(i)== harf.charAt(0)) {
					sayac ++;
					indexler += i + ", ";
				}
			}
			System.out.println(harf + " harfi " + kelime + " kelimesinde " + sayac + " kere geçmektedir.");			
			System.out.println(harf + " harfinin bulunduğu indexler: " + indexler);
			break;
			
		case 2: 
			System.out.println("Kelime girin");
			String kelime2 = scanner.nextLine();
			System.out.println("Değiştirmek istediğiniz harfi girin");
			String eskiHarf = scanner.nextLine();
			
			if(!kelime2.contains(eskiHarf)) {
				System.out.println("Değiştirmek istediğiniz harf kelime içinde yoktur");
				break;
			}
			
			System.out.println("Hangi harfle değiştirmek istediğinizi girin");
			String yeniHarf = scanner.nextLine();
			
			for (int i = 0; i<kelime2.length(); i++) {
				if(kelime2.charAt(i)== eskiHarf.charAt(0)) {
					kelime2 = kelime2.replace(eskiHarf, yeniHarf);
					System.out.println(kelime2);
				}
			}	
			
			break;
		case 3:
			System.out.println("Bir kelime girin");             // K A B A K
			String kelime3 = scanner.nextLine();                // 0 1 2 3 4 
			int counter = kelime3.length()/2;
			boolean polindrom = false;
			
			while(polindrom == false) {
				
				for(int i = 0; i <kelime3.length()/2; i++) { 
					
					while (counter > 0) {
					if (kelime3.charAt(i) == kelime3.charAt(kelime3.length()-i-1)) {
						counter --;
					}
					else {
						System.out.println("Girilen kelime polindrom değildir.");
						polindrom = true;
						break;
					}
					}

					}
				if (counter == 0) {
					System.out.println("kelime polindrom");
					polindrom = true;
					}
			}
			
			break;

		default:
			System.out.println("Geçerli bir sayı girmediniz.");
			break;			
		}
		System.out.println("Teşekkürler!");
	}


}
