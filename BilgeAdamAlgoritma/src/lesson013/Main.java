package lesson013;

public class Main {
	
	// Sınav sınıfı oluşturalım ve attribute'lerini yazalım
	
	// Soru sınıfı oluşturalım
	
	// Sınav oluştur metodu yazalım

	public static void main(String[] args) {
		
//		Soru soru1 = new Soru();
//	//	String[] cevapSecenekleri = {"A", "B", "C", "D" };
//		
//		soru1.soruOlustur(Sinav.cevapSecenekleri);
//		
//		// A B C D
//		System.out.println("------------");
//		for (int i = 0; i < soru1.getCevapIcerikleri().length; i++) {
//			System.out.println(soru1.getCevapIcerikleri()[i]);
//		}
		
		Sinav sinav1 = new Sinav();
		sinav1.sinavOlustur();
		
		for (int i = 0; i < sinav1.getSorular().length; i++) {
			System.out.println(sinav1.getSorular()[i].getIcerik());
		}
		
		System.out.println("------------");
		sinav1.cevapGir();
		sinav1.cevaplariKontrolEt();

	}

}
