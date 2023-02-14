package maraton1;

public class Soru1 {

	private static void yildizlariYazdir() {
		String yildiz = "* ";
		for (int i = 0; i < 7; i++) {
			System.out.println(yildiz);

			if (i == 6) {
				for (int j = 0; j < 3; j++) {
					System.out.println(yildiz);
				}
			}
			yildiz = yildiz + "* ";
		}

	}

	public static void main(String[] args) {

		yildizlariYazdir();
	}

}
