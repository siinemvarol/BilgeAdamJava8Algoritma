package lesson015.veteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {

	private String okul;
	private int calismaYili;
	private ArrayList<Musteri> musteriListesi;

	public Veteriner(String tc, String isim, String okul, int calismaYili) {
		super(tc, isim);
		this.okul = okul;
		this.calismaYili = calismaYili;
		musteriListesi = new ArrayList<Musteri>();
	}

	public void musteriEkle(Musteri musteri) {
		musteriListesi.add(musteri);
		System.out.println(musteri.getName() + ",  veteriner " + getName() + " 'e müşteri olarak eklendi");
	}

	public void musteriGoruntule() {
		System.out.println("Veteriner " + getName() + " in müşterileri: ");
		for (Musteri musteri : musteriListesi) {
			System.out.println(musteri.getName());
		}
	}

//	public void kayitliHayvanlariGetir(Musteri musteri) {
//		for (Hayvan hayvan : musteri.getHayvanListesi()) {
//			if (hayvan.isKayitliMi()) {
//				System.out.println(hayvan.getName() + " kayıtlı");
//			} else {
//				emailGonder(musteri);
//			}
//
//		}
//	}

	public void emailGonder(Musteri musteri) {
		for (Hayvan hayvan : musteri.getHayvanListesi()) {
			if (hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName() + " kayıtlı");
			} else {
				System.out.println(musteri.getName() + " lütfen " + hayvan.getName() + " isimli hayvanı kayıt ettiriniz");
			}

		}
		
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());

	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	public int getCalismaYili() {
		return calismaYili;
	}

	public void setCalismaYili(int calismaYili) {
		this.calismaYili = calismaYili;
	}

	@Override
	public String toString() {
		return super.toString() + " Veteriner [okul=" + okul + ", calismaYili=" + calismaYili + "]";
	}

}
