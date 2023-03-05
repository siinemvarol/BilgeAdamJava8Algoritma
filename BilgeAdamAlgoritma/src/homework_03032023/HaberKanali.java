package homework_03032023;

public class HaberKanali extends Kanal {

	private EHaberTuru haberTuru;
	
	public HaberKanali(String kanalAdi, int kanalNo, EHaberTuru haberTuru) {
		super(kanalAdi, kanalNo);
		this.haberTuru = haberTuru;		
	}

	public EHaberTuru getHaberTuru() {
		return haberTuru;
	}

	public void setHaberTuru(EHaberTuru haberTuru) {
		this.haberTuru = haberTuru;
	}

}
