package lesson008;

public class Question61 {

	private static void asalMi(int i) {
		boolean asalMi = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				asalMi = false;
			}
		}
		if (asalMi) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// 1'den 1000'e kadar olan sayılardan asal olanları bulan metodu yazalım
		// asalMi metodunda sayılar asal mı diye kontrol edeceğiz
		// main metodda for döngüsüne sokup bulacağız

		for (int i = 2; i < 1000; i++) {
			asalMi(i);
		}

	}

}
