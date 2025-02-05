package com.sinemvarol_2;

public class Main {

	/*
	 * Takım diye bir sınıf oluşturalım. name, puan ve kasa fieldları olsun takımlar
	 * aralarında maç yapacak şekilde metod yazalım metodda random 1, 2 ve 3
	 * sayıları arasından seçilecek. 
	 * 1 gelirse ilk takım maçı kazanacak 3 puan alacak ve takım kasasına 10.000 TL eklenecek
	 * 2 gelirse ikinci takım maçı kazanacak 3 puan alacak ve takım kasasına 10.000 TL eklenecek
	 * 1 veya 2 gelmezse eğer maç berabere biter, iki takım da 1'er puan alır ve iki takımın
	 * da kasasına 5.000 TL eklenir. 
	 * takım1 barcelona takım2 real madrid 
	 * barcelona real madride karşı maçı kazanmıştır 
	 * 
	 * takimManager.macYap(takim1, takim2);
	 * 
	 * kasa göster metodu çıktı --> takim ismi ... + takım kasası...
	 * 
	 * puan durumu gösteren metod, parametre olarak takımlar arrayini göndericez
	 * çıktı --> takım + puanı bize yazdırsın
	 * 
	 * iflasEtmeDurumu()nda olan takımları bize göstersin takımın kasası 5.000
	 * TL'den az ise bu takımları listeleyeceğiz
	 * 
	 * Şampiyonu göster metodu parametre olarak takımlar array alsın 
	 * !!Şampiyon .... yazdırsın
	 */

	public static void main(String[] args) {

		Lig lig = new Lig();
		TakimManager takimManager = new TakimManager();

		lig.takimEkle("FC Bayern Münih");
		lig.takimEkle("Manchester City FC");
		lig.takimEkle("FC Barcelona");
		lig.takimEkle("PSG FC");
		lig.takimEkle("Liverpool FC");
		lig.takimEkle("Arsenal FC");
		lig.takimEkle("Real Madrid CF");
		lig.takimEkle("SSC Napoli");
		lig.takimEkle("FC Porto");
		lig.takimEkle("RB Leipzig");
//		lig.takimEkle("Fenerbahçe");

		for (int i = 0; i < lig.getTakimlarArray().length; i++) {
			System.out.println((i + 1) + ". takımın maçları -" + lig.getTakimlarArray()[i].getName() + "-\n");
			if (i == lig.getTakimlarArray().length - 1) {
				System.out.println("Tüm maçlar oynanmıştır !");
			}
			for (int j = 0; j < lig.getTakimlarArray().length; j++) {
				if ((i != j) && (j > i)) {
					takimManager.macYap(lig.getTakimlarArray()[i], lig.getTakimlarArray()[j]);
				}

			}
			System.out.println("- - - - - - - - - -");
		}

		System.out.println("\n* * * Şampiyonlar Ligindeki Takımların Kasası * * *\n");
		takimManager.kasaGoster(lig.getTakimlarArray());

		System.out.println("\n* * * Şampiyonlar Ligindeki Takımların Puan Durumu * * *\n");
		takimManager.puanDurumuGoster(lig.getTakimlarArray());

		// ligde 10 takım olduğu için iflas etme durumunda olan takım çıkmıyor
		// (hepsi 2 ve üzeri maç kazanmış oluyor)
		// Lig class'ında takimlarArray'in boyutunu 4 ya da daha az set edip o sayıya
		// göre Main'de takım eklediğimiz 35-44. satırları düzenleyince
		// iflas etme durumundaki takımlar listeleniyor
		System.out.println("\n* * * İflas Etme Durumunda Olan Takımlar * * *\n");
		takimManager.iflasEtmeDurumu(lig.getTakimlarArray());

		System.out.println("\n* * * Şampiyon Takım * * *\n");
		takimManager.sampiyonuGoster(lig.getTakimlarArray());

	}

}
