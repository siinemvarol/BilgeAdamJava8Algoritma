package com.sinemvarol_2;

import java.util.Random;

public class TakimManager {

	public void macYap(Takim birinciTakim, Takim ikinciTakim) {
		Random random = new Random();
		int number = random.nextInt(1, 4);
		if (number == 1) {
			birinciTakim.setPuan(birinciTakim.getPuan() + 3);
			birinciTakim.setKasa(birinciTakim.getKasa() + 10000);
			System.out.println(
					birinciTakim.getName() + " takımı, " + ikinciTakim.getName() + " takımına karşı maçı kazanmıştır.");
		} else if (number == 2) {
			ikinciTakim.setPuan(ikinciTakim.getPuan() + 3);
			ikinciTakim.setKasa(ikinciTakim.getKasa() + 10000);
			System.out.println(
					ikinciTakim.getName() + " takımı, " + birinciTakim.getName() + " takımına karşı maçı kazanmıştır.");
		} else {
			birinciTakim.setPuan(birinciTakim.getPuan() + 1);
			ikinciTakim.setPuan(ikinciTakim.getPuan() + 1);
			birinciTakim.setKasa(birinciTakim.getKasa() + 5000);
			ikinciTakim.setKasa(ikinciTakim.getKasa() + 5000);
			System.out.println(birinciTakim.getName() + " ve " + ikinciTakim.getName() + " berabere kalmıştır.");
		}
	}

	public void kasaGoster(Takim[] takimlarArray) {
		int counter = 1;
		for (Takim takim : takimlarArray) {
			System.out.println(counter + ". " + takim.getName() + " takımının kasası: " + takim.getKasa());
			counter++;
		}

	}

	public void puanDurumuGoster(Takim[] takimlarArray) {
		int counter = 1;
		for (Takim takim : takimlarArray) {
			System.out.println(counter + ". Takım adı: " + takim.getName() + " Puanı: " + takim.getPuan());
			counter++;
		}

	}

	public void iflasEtmeDurumu(Takim[] takimlarArray) {
		int counter = 1;
		for (Takim takim : takimlarArray) {
			if (takim.getKasa() <= 5000) {
				System.out.println(counter + ". İflas etme durumundaki takım: " + takim.getName() + " - Kasası: "
						+ takim.getKasa());
				counter++;
			}
		}
		if (counter == 1) {
			System.out.println("Ligde iflas etme durumunda olan takım yoktur !");
		}
	}

	public void sampiyonuGoster(Takim[] takimlarArray) {
		int maxPuan = 0;
		Takim sampiyonTakim = new Takim();

		for (Takim takim : takimlarArray) {
			if (takim.getPuan() > maxPuan) {
				maxPuan = takim.getPuan();
				sampiyonTakim = takim;
			}
		}
		System.out.println("En yüksek puanla kazanan takım: * * * " + sampiyonTakim.getName() + " * * * Puanı: "
				+ sampiyonTakim.getPuan());

		for (Takim takim : takimlarArray) {
			if ((takim.getPuan() == maxPuan) && (takim != sampiyonTakim)) {
				System.out.println("En yüksek puanla kazanan takım (şampiyonluğu paylaşan takım): * * * "
						+ takim.getName() + " * * * Puanı: " + takim.getPuan());
			}
		}
	}

}
