package lesson017;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek {

	// Bir tane ArrayList oluşturalım
	// içine manuel şehir atalım
	// bu şehirlerden "an" ile başlayan varsa bu şehri "xxx" yapalım

	public static void degerDegistirme(List<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			if (sehirler.get(i).substring(0, 2).equalsIgnoreCase("an")) {
				sehirler.set(i, "xxx");
			}

		}
	}

	public static void degerDegistirme3(List<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			String deger = sehirler.get(i);
			if(deger.toLowerCase().startsWith("an")) {
				deger = deger.toLowerCase().replace("an", "xxx");
				System.out.println(deger);
			}

		}
	}

	public static void main(String[] args) {
		List<String> arrayList1 = new ArrayList<String>();

		arrayList1.add("izmir");
		arrayList1.add("istanbul");
		arrayList1.add("Ankara");
		arrayList1.add("bursa");
		arrayList1.add("bodrum");

//		degerDegistirme(arrayList1);

		for (String sehir : arrayList1) {
			System.out.println(sehir);
		}
		
		System.out.println("\n- - - - - ");
		degerDegistirme3(arrayList1);
		
	}

}
