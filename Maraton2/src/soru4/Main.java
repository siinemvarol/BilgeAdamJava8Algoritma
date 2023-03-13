package soru4;

public class Main {

	public static void main(String[] args) {
		
		Yolcu yolcu1 = new BusinessYolcu(7755, "Mert", "Kaya", false);
		Yolcu yolcu2 = new EkonomiYolcu(889, "Ahmet", "Demir");
		Yolcu yolcu3 = new BusinessYolcu(555, "Aslı", "Bahar", true);
		
		System.out.println("- - - BUSINESS VIP YOLCU - - -");
		yolcu3.biletAl(FirmaAdi.ADJ);
		yolcu3.biletAl(FirmaAdi.THY);
		System.out.println("* * *");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		System.out.println("\n- - - EKONOMI YOLCU - - -");
		yolcu2.biletAl(FirmaAdi.ADJ);
		yolcu2.biletAl(FirmaAdi.THY);
		yolcu2.biletAl(FirmaAdi.THY);
		yolcu2.biletAl(FirmaAdi.THY);
		System.out.println("* * *");
		
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();	
	
	}

}
