package soru3;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikeliMi(true);
		HayvanatBahcesi.hayvanlar.add(this);
	}

	@Override
	public void surun() {
		System.out.println(getAd() + " isimli yılan sürünerek gidiyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " tıslama sesi çıkarıyor..");

	}

}
