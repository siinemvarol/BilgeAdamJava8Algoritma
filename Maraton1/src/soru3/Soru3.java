package soru3;

public class Soru3 {

	private static int karakterSayici(String kelime, char karakter) {
		int tekrarSayisi = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == karakter) {
				tekrarSayisi++;
			}
		}
		return tekrarSayisi;

	}

	public static void main(String[] args) {
		int sayimSonucu1 = karakterSayici("Bugün güzel bir gün", 'g');
		System.out.println(sayimSonucu1);
		int sayimSonucu2 = karakterSayici("Bugün güzel bir gün", 'x');
		System.out.println(sayimSonucu2);
	}

}
