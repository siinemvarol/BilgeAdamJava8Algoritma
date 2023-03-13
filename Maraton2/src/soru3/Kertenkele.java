package soru3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		HayvanatBahcesi.hayvanlar.add(this);
	}

	@Override
	public void surun() {
		System.out.println(getAd() + " isimli kertenkele sürünerek gidiyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " kertenkele sesi çıkarıyor..");

	}

}
