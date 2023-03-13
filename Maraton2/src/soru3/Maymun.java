package soru3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		HayvanatBahcesi.hayvanlar.add(this);
	}

	@Override
	public void yuru() {
		System.out.println(getAd() + " isimli maymun yürüyerek gidiyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " maymun sesi çıkarıyor..");

	}

}
