package lesson005;

import java.util.Arrays;

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = {-2,-4,10,5,4,5,-5,-3};
		int count = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<0) {
				count++;
			}
		}
		int[]negatifSayilar = new int[count];
		int index = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<0) {
				negatifSayilar[index] = sayilar[i];      // soldaki 20 ve 21. satır yerine 21. satırı silip 20. satıra aşağıdakini yazarım
				index++;								// negatifSayilar[index++]
			}
		}
		for (int i = 0; i < negatifSayilar.length; i++) {
			System.out.println(negatifSayilar[i]);
		}
		System.out.println(Arrays.toString(negatifSayilar));
 
	}

}
