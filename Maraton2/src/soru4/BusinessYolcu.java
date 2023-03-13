package soru4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {

	private static final int BUSINESSFIYAT = 200;
	private static final int BUSINESSVIPFIYAT = 150;
	private static HashMap<String, Integer> biletler = new HashMap<>();
	private boolean vipYolcuMu;

	public BusinessYolcu(int id, String ad, String soyad, boolean vipYolcuMu) {
		super(id, ad, soyad);
		setKoltukNo(generateRandomKoltukNo());
		this.vipYolcuMu = vipYolcuMu;
	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		int biletParasi;
		if (vipYolcuMu) {
			biletParasi = Yolcu.BASEFIYAT + BUSINESSFIYAT + BUSINESSVIPFIYAT;
		} else {
			biletParasi = Yolcu.BASEFIYAT + BUSINESSFIYAT;
		}

		if (biletler.containsKey(firmaAdi.toString())) {
			BusinessYolcu.biletler.put(firmaAdi.toString(),
					(BusinessYolcu.biletler.get(firmaAdi.toString()) + biletParasi));
			System.out.println(
					firmaAdi.toString() + " adlı firmadan bir bilet daha alınmıştır. Biletleriniz: " + getBiletler());
		} else {

			BusinessYolcu.biletler.put(firmaAdi.toString(), biletParasi);
			System.out.println(getAd() + " adlı yolcu " + firmaAdi.toString()
					+ " için VIP bilet almıştır. Biletleriniz: " + getBiletler());
		}

	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " check-in önceden yapılmıştır, uçağa binebilirsiniz.");
		} else {
			setCheckIn(true);
			System.out.println("Check-in yapılmıştır, iyi uçuşlar.");
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
		System.out.println("Yolcu Bilgileri: Business Yolcusu " + getAd() + " - Biletleri " + getBiletler());

	}

	public static HashMap<String, Integer> getBiletler() {
		return biletler;
	}

	public static void setBiletler(HashMap<String, Integer> biletler) {
		BusinessYolcu.biletler = biletler;
	}

	public static int getBusinessfiyat() {
		return BUSINESSFIYAT;
	}

	public static int getBusinessvipfiyat() {
		return BUSINESSVIPFIYAT;
	}

	public boolean isVipYolcuMu() {
		return vipYolcuMu;
	}

	public void setVipYolcuMu(boolean vipYolcuMu) {
		this.vipYolcuMu = vipYolcuMu;
	}

}
