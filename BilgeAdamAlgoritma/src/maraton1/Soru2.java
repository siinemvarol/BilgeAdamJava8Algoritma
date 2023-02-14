package maraton1;

public class Soru2 {

	private static void tekrarEdenSayiyiBul(int[] array) {
		int tekrarSayisi = 1;
		int tekrarlayanSayi = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != tekrarlayanSayi) {
				for (int j = 0; j < array.length; j++) {
					if (i != j) {
						if (array[i] == array[j]) {
							tekrarlayanSayi = array[i];
							tekrarSayisi++;
						}

					}
				}
			}
		}
		if (tekrarlayanSayi != Integer.MAX_VALUE) {
			System.out.println(tekrarlayanSayi + " sayısı " + tekrarSayisi + " kez tekrar ediyor.");
		} else {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}

	}

	public static void main(String[] args) {

		int[] sayiDizisi1 = { 9, 7, 5, 3, 7, 7, 23, 18, 2, 0, 7 };
		int[] sayiDizisi2 = { 0, 1, 5, 3 };
		int[] sayiDizisi3 = { 2, 3, 43, 5, 3 };

		tekrarEdenSayiyiBul(sayiDizisi1);
		tekrarEdenSayiyiBul(sayiDizisi2);
		tekrarEdenSayiyiBul(sayiDizisi3);

	}

}
