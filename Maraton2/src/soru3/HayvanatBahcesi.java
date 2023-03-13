package soru3;

import java.util.ArrayList;

public class HayvanatBahcesi {

	public static ArrayList<Hayvan> hayvanlar = new ArrayList<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		hayvanlar.add(m);
	}

	public void bahceyeSurungenEkle(Surungen s) {
		hayvanlar.add(s);
	}

	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String hayvanAdi) {
		Hayvan aranan = null;
		for (Hayvan hayvan : hayvanlar) {
			if (hayvan.getAd().equalsIgnoreCase(hayvanAdi)) {
				aranan = hayvan;
			}
		}
		if (aranan != null) {
			System.out.println(aranan.getAd() + " bir " + aranan.getClass().getSuperclass().getSimpleName());
		} else {
			System.out.println(hayvanAdi + " isimli hayvan bu hayvanat bahçesinde yok!");
		}
	}

	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		Hayvan aranan = null;
		for (Hayvan hayvan : hayvanlar) {
			if (hayvan.getAd().equalsIgnoreCase(hayvanAdi)) {
				aranan = hayvan;
			}
		}
		if (aranan != null) {
			System.out.println(aranan.toString());
		} else {
			System.out.println(hayvanAdi + " isimli hayvan bu hayvanat bahçesinde yok!");
		}

	}

	public void hayvaniHareketEttir(String hayvanAdi) {

		Surungen arananSurungen = null;
		MemeliHayvan arananMemeliHayvan = null;

		boolean hayvanBulunduMu = false;

		for (Hayvan hayvan : hayvanlar) {
			if (hayvan.getAd().equals(hayvanAdi)) {
				try {
					arananSurungen = (Surungen) hayvan;
					if (arananSurungen != null) {
						hayvanBulunduMu = true;
						arananSurungen.surun();
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					try {
						if (hayvanBulunduMu == false) {
							for (Hayvan hayvan2 : hayvanlar) {
								if (hayvan2.getAd().equals(hayvanAdi)) {
									arananMemeliHayvan = (MemeliHayvan) hayvan2;
								}
							}
							if (arananMemeliHayvan != null) {
								arananMemeliHayvan.yuru();
								break;
							}
						}

					} catch (Exception e2) {
						// TODO: handle exception
					}
				}

			}
		}
		if (arananSurungen == null || arananMemeliHayvan == null) {

		} else {
			System.out.println(hayvanAdi + " isimli hayvan bu hayvanat bahçesinde yok!");
		}

	}

	public static ArrayList<Hayvan> getHayvanlar() {
		return hayvanlar;
	}

	public static void setHayvanlar(ArrayList<Hayvan> hayvanlar) {
		HayvanatBahcesi.hayvanlar = hayvanlar;
	}

}
