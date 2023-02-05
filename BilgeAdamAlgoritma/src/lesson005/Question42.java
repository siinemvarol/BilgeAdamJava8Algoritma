package lesson005;

public class Question42 {

	public static void main(String[] args) {
		// nu sayı çifttir ve bu sayı tektir şeklinde çıktı olacak
		// dizideki tüm sayıların toplamını verecek
		
		int[] sayilar = {2,4,10,5};
		int toplam = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i]%2 == 0) {				
				System.out.println("dizinin " + i + ". indexindeki " + sayilar[i] + " çifttir.");
			}
			else {				
				System.out.println("dizinin " + i + ". indexindeki " + sayilar[i] + " tektir.");
			}
		}
		System.out.println("Arraydeki sayıların toplamı: " + toplam);
	}

}
