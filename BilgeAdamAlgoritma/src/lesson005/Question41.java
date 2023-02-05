package lesson005;

import java.util.Arrays;

public class Question41 {

	public static void main(String[] args) {
		// Aşağıdaki arrayde sıfırdan küçük sayılar yerine 100 koyalım
		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
	//	Integer[] yeniSayilar = new Integer[2];
		//int[] yeniSayilar = null;
		int sayac = 0;
		for(int i = 0; i <sayilar.length; i++) {
			if(sayilar[i] < 0) {
				sayilar[i] = 100;
		//		yeniSayilar[i] = sayilar [i];
				int yeniSayi = sayilar[i];
				System.out.println(i + ". indexi " + yeniSayi + " ile değişti.");
			}
		}
		System.out.println("-------");
		
		for(int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
		
		System.out.println("--------");
		System.out.println(Arrays.toString(sayilar));
		System.out.println("--------");
//		System.out.println(Arrays.toString(yeniSayilar));
	}

}
