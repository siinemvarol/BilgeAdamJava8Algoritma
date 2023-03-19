package com.sinemvarol_2;

public class Lig {

	private Takim[] takimlarArray = new Takim[10];
	private int takimSayisi = 0;

	public void takimEkle(String name) {
		
		if (takimSayisi < takimlarArray.length) {
			Takim takim = new Takim();
			takim.setName(name);
			takimlarArray[takimSayisi] = takim;
			takimSayisi++;
		} else {
			System.err.println("Ligde en fazla " + takimlarArray.length + " takım olabilir.");
		}
	}

	public Takim[] getTakimlarArray() {
		return takimlarArray;
	}

	public void setTakimlarArray(Takim[] takimlarArray) {
		this.takimlarArray = takimlarArray;
	}

	public int getTakimSayisi() {
		return takimSayisi;
	}

	public void setTakimSayisi(int takimSayisi) {
		this.takimSayisi = takimSayisi;
	}

}
