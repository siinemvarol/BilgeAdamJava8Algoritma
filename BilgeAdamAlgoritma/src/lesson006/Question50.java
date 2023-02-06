package lesson006;

public class Question50 {

	public static void main(String[] args) {
		// Bir dizide art arda gelen iki indexteki sayının değeri 2 ise true yoksa false yazdıralım
		
		int[] sayilar = { 2, -256, -256, 2, 2, 1258, 32 };
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] != (sayilar.length-1)) {
				if ((sayilar[i] == 2) && (sayilar[i+1] == 2)) {
					System.out.println("true index: " + i + " ve " + (i+1) + " için.");
				}
			else if (i == sayilar.length-1) {
				break;
			}
		}

	}

}
}
