package soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soru1 {

	public static HashMap<String, String> rehberdekiKisiler = new HashMap<>();

	public static Scanner consoleScanner = new Scanner(System.in);

	public static void readFile() {

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("rehber.txt")))) {

			while (scanner.hasNextLine()) {
				String readingLine = scanner.nextLine();
				String[] readingArray = readingLine.split(";");
				rehberdekiKisiler.put(readingArray[0],
						readingArray[2].trim().substring(0, readingArray[2].length() - 1));

			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found..");
			e.printStackTrace();
		}
	}

	public static void findPeople() {
		System.out.println("Lütfen telefonunu aradığınız kişinin adını giriniz:");
		String name = consoleScanner.nextLine();
		System.out.println("Lütfen telefonunu aradığınız kişinin soyadını giriniz:");
		String surname = consoleScanner.nextLine();

		String arananIsim = name + " " + surname;

		boolean searchResult = false;

		for (Map.Entry<String, String> isimler : rehberdekiKisiler.entrySet()) {
			if (isimler.getKey().equalsIgnoreCase(arananIsim)) {
				searchResult = true;
				System.out.println(name + " " + surname + " kişisinin tel no: " + isimler.getValue());
				break;
			}
		}

		if (searchResult == false) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		}

	}

	public static void main(String[] args) {

		readFile();
		System.out.println(rehberdekiKisiler + "\n");
		findPeople();

	}

}
