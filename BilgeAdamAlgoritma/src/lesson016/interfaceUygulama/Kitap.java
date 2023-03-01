package lesson016.interfaceUygulama;

public class Kitap {

	private String isim;
	private String yazar;
	private double fiyat;
	private boolean indirimdeMi;

	public Kitap(String isim, String yazar, double fiyat) {
		super();
		this.isim = isim;
		this.yazar = yazar;
		this.fiyat = fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public boolean isIndirimdeMi() {
		return indirimdeMi;
	}

	public void setIndirimdeMi(boolean indirimdeMi) {
		this.indirimdeMi = indirimdeMi;
	}

}
