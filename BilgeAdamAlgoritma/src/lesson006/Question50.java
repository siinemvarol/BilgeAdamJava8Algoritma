package lesson006;

public class Question50 {

	public static void main(String[] args) {
		// Bir dizide art arda gelen iki indexteki sayının değeri 2 ise true yoksa false
		// yazdıralım

		int[] sayilar = { 2, -256, -256, 2, 2, 1258, 32, 2, 2 };

		// Alternatif 1

		for (int i = 0; i < sayilar.length - 1; i++) {
			if ((sayilar[i] == 2) && (sayilar[i + 1] == 2)) {
				System.out.println("true index: " + i + " ve " + (i + 1) + " için.");
			}
		}

	

	// Alternatif 2s

		System.out.println();
		
		boolean check = false;
		for (int i = 0; i < sayilar.length -1; i++) {
			if(sayilar[i] == 2 && sayilar[i+1] == 2) {
				check = true;
			}
		}
		System.out.println(check);

}
	
}
