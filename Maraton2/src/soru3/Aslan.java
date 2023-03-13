package soru3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikeliMi(true);
		HayvanatBahcesi.hayvanlar.add(this);
	}

	@Override
	public void yuru() {
		System.out.println(getAd() + " isimli aslan yürüyerek gidiyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " kükrüyor..");
	}

}
