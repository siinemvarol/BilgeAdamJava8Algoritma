package lesson009;

public class Question67 {
	//Cosenio
	
	// girilen sayının, arraydeki kaç sayıdan büyük olduğunu bulan metod
	// array uzunluğu 1 ile 100 arasında olacak
	// girilen sayı 1 ile 100 arasında olacak
	// arrayin içindeki sayılar da 1 ile 100 arasında olacak
	// metod int bir değer dönecek
	

	

	public static void main(String[] args) {
		int[]myNum = { 1, 3, 4, 6, 9 };
		
		int sonuc1 = kucukleriSay(myNum, 6);
		int sonuc2 = kucukleriSay(myNum, 3);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
	}

	private static int kucukleriSay(int[]array, int sayi) {
		if (array.length < 1 || array.length > 100) {
			System.out.println("arrayin uzunluğu 1-100 arasında olmalı");
		}
		if (sayi < 1 || sayi > 100) {
			System.out.println("sayi 1-100 arasında olmalı");
		}
		
		for (int arrayinIcerigi : array) {
			if (arrayinIcerigi < 1 || arrayinIcerigi > 100) {
				System.out.println("arrayin elemanları 1-100 arasında olmalı");
			}
		}
		
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < sayi) {
				counter++;
			}
		}
		return counter;
		
	}
	
}
	
	

