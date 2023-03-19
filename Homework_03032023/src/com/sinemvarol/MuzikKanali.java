package com.sinemvarol;

public class MuzikKanali extends Kanal {

	private EHaberTuru haberTuru;
	
	public MuzikKanali(String kanalAdi, int kanalNo, EHaberTuru haberTuru) {
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
