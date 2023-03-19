package com.sinemvarol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class IstiklalMarsi {

	// Toplam Satır Sayısı-->50
	// Toplam Kelime Sayısı--> 273
	// toplam Karakter Sayısı--> 1593
	// En çok tekrar eden kelime--> arkadaş

	private static List<String> satirlarListesi = new ArrayList<>();
	private static List<String> kelimelerListesi = new ArrayList<>();
	private static List<String> karakterlerListesi = new ArrayList<>();
	private static List<String> noktalamaIsaretiAyiklanmisListesi = new ArrayList<>();
	private static HashMap<String, Integer> kelimeSayisiMap = new HashMap<>();

	public static void dosyayiOkuVeSatirlaraAyir() {

		try (Scanner scanner = new Scanner(new FileReader("Mars.txt"))) {

			while (scanner.hasNext()) {
				String okunanSatir = scanner.nextLine();
				String[] satirlar = okunanSatir.split("\n");
				for (int i = 0; i < satirlar.length; i++) {
					satirlarListesi.add(satirlar[i]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	//	System.out.println(satirlarListesi);

	}

	public static void dosyayiOkuVeKelimelereAyir() {

		try (Scanner scanner = new Scanner(new FileReader("Mars.txt"))) {

			while (scanner.hasNext()) {
				String okunanSatir = scanner.nextLine();
				String[] kelimeler = okunanSatir.split(" ");
				for (int i = 0; i < kelimeler.length; i++) {
					kelimelerListesi.add(kelimeler[i]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	//	System.out.println(kelimelerListesi);

	}

	public static void dosyayiOkuVeKarakterlereAyir() {

		String[] karakterler = null;

		try (Scanner scanner = new Scanner(new FileReader("Mars.txt"))) {

			while (scanner.hasNext()) {
				String okunanSatir = scanner.nextLine();
				karakterler = okunanSatir.split("");
				for (int i = 0; i < karakterler.length; i++) {
					karakterlerListesi.add(karakterler[i]);
				}
			}
			
	//		System.out.println(karakterlerListesi);

			Iterator<String> iterator = karakterlerListesi.iterator();

			while (iterator.hasNext()) {
				if (iterator.next().equals(" ")) {
					iterator.remove();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	//	System.out.println(karakterlerListesi);

	}

	public static void enCokTekrarEdenKelimeyiBul() {

		Iterator<String> iterator1 = kelimelerListesi.iterator();

		while (iterator1.hasNext()) {
			noktalamaIsaretiAyiklanmisListesi.add(iterator1.next().toLowerCase());
		}

		ListIterator<String> iterator = noktalamaIsaretiAyiklanmisListesi.listIterator();

		while (iterator.hasNext()) {
			String temp = "";
			String iteratorString = iterator.next();
			if (iteratorString.contains(",") || iteratorString.contains(".") || iteratorString.contains(";")
					|| iteratorString.contains("!") || iteratorString.contains("?")) {

				for (int i = 0; i < iteratorString.length() - 1; i++) {
					if ((iteratorString.charAt(i) != ',') && (iteratorString.charAt(i) != '.')
							&& (iteratorString.charAt(i) != ';') && (iteratorString.charAt(i) != '!')
							&& (iteratorString.charAt(i) != '?')) {
						temp += iteratorString.charAt(i);
		//				System.out.println("temp: " + temp);
					}
				}
				iterator.set(temp);
				temp = "";
			}
		}

//		System.out.println(noktalamaIsaretiAyiklanmisListesi);
		
		Iterator<String> iterator2 = noktalamaIsaretiAyiklanmisListesi.iterator();
		
		
		while (iterator2.hasNext()) {
			String kelime = iterator2.next();
			if(kelimeSayisiMap.containsKey(kelime)) {
				kelimeSayisiMap.put(kelime, kelimeSayisiMap.get(kelime) + 1);
			} else {
				kelimeSayisiMap.put(kelime, 1);
			}			
		}
		
	//	System.out.println(kelimeSayisiMap);
		
		int tekrarSayisi = 0;
		String enCokTekrarEdenKelime = "";
		
		for (Map.Entry<String, Integer> kelime : kelimeSayisiMap.entrySet()) {
			if ((kelime.getValue() > tekrarSayisi) && !(kelime.getKey().equals(""))) {
				enCokTekrarEdenKelime = kelime.getKey();
				tekrarSayisi = kelime.getValue();
			}
		}
		System.out.println("En çok tekrar eden kelime: " + enCokTekrarEdenKelime + " Tekrar sayısı: " + tekrarSayisi);

	}

	public static void main(String[] args) {

		dosyayiOkuVeSatirlaraAyir();
		System.out.println("Satir sayisi: " + satirlarListesi.size());
		System.out.println("- - - - - ");
		dosyayiOkuVeKelimelereAyir();
		System.out.println("Kelime sayisi: " + kelimelerListesi.size());
		System.out.println("- - - - - ");
		dosyayiOkuVeKarakterlereAyir();
		System.out.println("Karakter sayisi: " + karakterlerListesi.size());
		System.out.println("* * * * *");
		enCokTekrarEdenKelimeyiBul();

	}

}
