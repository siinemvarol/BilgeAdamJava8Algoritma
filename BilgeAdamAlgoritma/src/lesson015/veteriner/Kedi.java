package lesson015.veteriner;

public class Kedi extends Hayvan {

	private String tur;
	private String cins;
	private String karne;

	public Kedi(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		setTur("kedi");
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public void karneOlustur() {
		setKarne("Cinsi: " + this.getCins() + " Türü: " + this.getTur());
		System.out.println(getName() + " için karne oluşturuldu: " + this.getKarne());

	}	

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}

	@Override
	public String toString() {
		return super.toString() + " Kedi [tur=" + tur + ", cins=" + cins + ", karne=" + karne + "]";
	}

}
