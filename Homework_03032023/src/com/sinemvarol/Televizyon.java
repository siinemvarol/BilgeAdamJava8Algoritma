package com.sinemvarol;

import java.util.ArrayList;

public class Televizyon {

	private String marka;
	private String boyut;
	private static ArrayList<Kanal> kanallar = new ArrayList<Kanal>();// static olmasına gerek var mı kontrol et
	private static boolean acikMi; // protected idi // static olmasına gerek var mı kontrol et
	protected static boolean kurulduMu; // protected idi // static olmasına gerek var mı kontrol et
	private static int ses = 0; // static olmasına gerek var mı kontrol et
	private static int acikKanalNo = 1; // static olmasına gerek var mı kontrol et

	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		Televizyon.kanallariOlustur();
		Televizyon.acikMi = false;
		Televizyon.kurulduMu = false;
		Televizyon.ses = 0;
		Televizyon.acikKanalNo = 1;
	}

	public static void kanallariOlustur() {
		Kanal kralPopTv = new MuzikKanali("Kral Pop TV", 1, EHaberTuru.MAGAZIN);
		Televizyon.kanallar.add(kralPopTv);
		Kanal dreamTv = new MuzikKanali("Dream TV", 2, EHaberTuru.MAGAZIN);
		Televizyon.kanallar.add(dreamTv);
		Kanal halkTv = new HaberKanali("Halk TV", 3, EHaberTuru.SPOR);
		Televizyon.kanallar.add(halkTv);
		Kanal haberTurkTv = new HaberKanali("Habertürk TV", 4, EHaberTuru.BORSA);
		Televizyon.kanallar.add(haberTurkTv);

	}

	public static void tvAc() {
		if (kurulduMu) {
			if (Televizyon.acikMi) {
				System.out.println("TV zaten açık !");
			} else {
				System.out.println("TV açıldı.");
				Televizyon.acikMi = true;
			}
		} else {
			System.out.println("\nTV açılmadan önce kurulmalıdır.\n");
		}

	}

	public static void sesiAc() {
		if (Televizyon.acikMi) {
			if (Televizyon.ses < 10) {
				Televizyon.ses++;
				System.out.println("TV Sesi: " + Televizyon.ses);
			} else {
				System.out.println("TV sesi maximum seviyede: 10");
			}
		} else {
			System.out.println("TV açık olmadığı için ses açılamadı.");
		}

	}

	public static void sesiAzalt() {
		if (Televizyon.acikMi) {
			if (Televizyon.ses > 0) {
				Televizyon.ses--;
				System.out.println("TV Sesi: " + Televizyon.ses);
			} else {
				System.out.println("TV sesi minimum seviyede: 0");
			}
		} else {
			System.out.println("TV açık olmadığı için ses kısılamadı.");
		}

	}

	public static void kanalDegistir() {
		if (Televizyon.acikMi) {
			if (getAcikKanalNo() > 0 && getAcikKanalNo() < 4) {
			setAcikKanalNo(getAcikKanalNo() + 1);
			}
			else {
				setAcikKanalNo(getAcikKanalNo() - 1);
			}
			System.out.println("Kanal değiştirildi.");
		} else {
			System.out.println("TV açık olmadığı için kanal değiştirilemedi.");
		}

	}

	public static void kanalBilgisiGoster() {
		if (Televizyon.acikMi) {
			for (Kanal kanal : Televizyon.kanallar) {
				if (kanal.getKanalNo() == Televizyon.acikKanalNo) {
					System.out.println("Açık Kanal No: " + kanal.getKanalNo() + " Adı: " + kanal.getKanalAdi());
				}
			}
		} else {
			System.out.println("TV açık olmadığı için kanal bilgisi gösterilemiyor.");
		}

	}

	public static void tvKapat() {
		if (Televizyon.acikMi) {
			System.out.println("TV kapatıldı.");
			Televizyon.acikMi = false;

		} else {
			System.out.println("TV zaten kapalı !");
		}

	}

	public String getMarka() {
		return marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public boolean isAcikMi() {
		return acikMi;
	}

	public void setAcikMi(boolean acikMi) {
		Televizyon.acikMi = acikMi;
	}

	public boolean isKurulduMu() {
		return kurulduMu;
	}

	public void setKurulduMu(boolean kurulduMu) {
		Televizyon.kurulduMu = kurulduMu;
	}

	public static int getSes() {
		return ses;
	}

	public static void setSes(int ses) {
		Televizyon.ses = ses;
	}

	public static int getAcikKanalNo() {
		return acikKanalNo;
	}

	public static void setAcikKanalNo(int acikKanalNo) {
		Televizyon.acikKanalNo = acikKanalNo;
	}

}
