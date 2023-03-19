package lesson024;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {

	/*
	 * 
	 * System.out.println("0 - Çıkış"); 
	 * System.out.println("1 - Dosya Yarat");
	 * System.out.println("2 - Metin Ekle"); 
	 * System.out.println("3 - Dosya Okuma");
	 * System.out.println("4 - Dosya Silme");
	 * System.out.println("Lütfen işlem seçiniz");
	 * 
	 */

	public static Scanner scanner = new Scanner(System.in);

	public void menu() {

		int input = 0;
		do {
			System.out.println("0 - Çıkış");
			System.out.println("1 - Dosya Yarat");
			System.out.println("2 - Metin Ekle");
			System.out.println("3 - Dosya Okuma");
			System.out.println("4 - Dosya Silme");
			System.out.println("Lütfen işlem seçiniz");

			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					metinEkle(FileSabitler.file);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					dosyaOku(FileSabitler.file);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 4:

				break;

			default:
				break;
			}

		} while (input != 0);
	}

	// dosya oluşmuşsa hata fırlatalım
	public void dosyaOlustur(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("Bu dosya önceden oluşturulmuştur.");
		} else {
			System.out.println("Dosya oluşturuluyor..");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("Dosyanız oluşturulmuştur.");
		}

//		try {
//			FileWriter fileWriter = new FileWriter(FileSabitler.file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void metinEkle(File file) throws Exception {

		if (file.exists()) {
			System.out.println("Dosyaya yazılacak metni girin:");
			String text = scanner.nextLine();
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(file, true);
				fileWriter.write(text + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (fileWriter != null) {
					try {
						fileWriter.close();
					} catch (Exception e) {
						throw new Exception("Dosya kapatma sırasında beklenmedik bir hata meydana geldi.");
					}
					
				}				
			}

		} else {
			throw new Exception("Metin yazmadan önce dosya oluşturulmalı");
		}
	}
	
	public void dosyaOku(File file) throws Exception {
		
		if (file.exists()) {
			FileReader fileReader = null;
			String text = "";
			int okunacak;
			
			try {
				fileReader = new FileReader(file);
				
				while ((okunacak=fileReader.read()) != -1) {
					text += (char) okunacak;
				}
				System.out.println(text);				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				fileReader.close();
			}
			
		} else {
			throw new Exception("Okunacak dosya bulunamadı");
		}
	}

	public static void main(String[] args) {

		FileIslemler fileIslemler = new FileIslemler();

		fileIslemler.menu();

	}

}
