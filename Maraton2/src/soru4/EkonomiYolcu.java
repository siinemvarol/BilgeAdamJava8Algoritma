package soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	public static final int EKONOMIFIYAT = 100;
	private static HashMap<String, Integer> biletler = new HashMap<>();

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		setKoltukNo(generateRandomKoltukNo());
	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		int biletParasi = Yolcu.BASEFIYAT + EKONOMIFIYAT;
		if (biletler.containsKey(firmaAdi.toString())) {
			EkonomiYolcu.biletler.put(firmaAdi.toString(),
					(EkonomiYolcu.biletler.get(firmaAdi.toString()) + biletParasi));
			System.out.println(
					firmaAdi.toString() + " adlı firmadan bir bilet daha alınmıştır. Biletleriniz: " + getBiletler());
		} else {
			EkonomiYolcu.biletler.put(firmaAdi.toString(), biletParasi);
			System.out.println(getAd() + " adlı yolcu " + firmaAdi.toString()
					+ " için ekonomi sınıfından bilet almıştır. Biletleriniz: " + getBiletler());
		}

	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " check-in önceden yapılmıştır, uçağa binebilirsiniz.");
		} else {
			setCheckIn(true);
			System.out.println("Check-in yapılmıştır, iyi uçuşlar !");
		}

	}

	@Override
	public void ucagaBin() {
		if (isCheckIn()) {
			System.out.println(getAd() + " " + getKoltukNo() + " numaralı koltukta uçağa binebilirsiniz.");
		} else {
			System.out.println("Uçağa binmek için lütfen check-in yapın!");
		}

	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri: Ekonomi Yolcusu " + getAd() + " - Biletleri " + getBiletler());

	}

	public static HashMap<String, Integer> getBiletler() {
		return biletler;
	}

	public static void setBiletler(HashMap<String, Integer> biletler) {
		EkonomiYolcu.biletler = biletler;
	}

	public static int getEkonomifiyat() {
		return EKONOMIFIYAT;
	}

}
