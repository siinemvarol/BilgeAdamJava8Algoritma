package lesson020;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Util {

	static Scanner scanner = new Scanner(System.in);

	public static int intDegerAl(String sorgu) {
		System.out.println(sorgu);
		boolean kontrol = false;
		int deger = 0;
		do {
			try {
				deger = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam değeri giriniz");
				kontrol = true;
			}
		} while (kontrol);

		return deger;
	}

	public static String stringDegerAl(String sorgu) {
		System.out.println(sorgu);
		String deger = scanner.nextLine();
		return deger;
	}
	
	public static LocalDate stringTarih() {
		boolean kontrol = false;
		int deger = 0;
//		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		LocalDate date = null;
		do {
			try {				
				date = LocalDate.parse(stringDegerAl("yıl-ay-gün formatında tarih giriniz:"));
				kontrol = false;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} while (kontrol);
				 
		return date;
		
	}

	// how to convert string to localDate
	// kullanıcıdan String olarak tarih alacağız (yıl-ay-gün) aldığımız değerleri
	// localDate'e çevireceğiz. yanlış formatta hata fırlatalım

	public static void main(String[] args) {
		LocalDate date = stringTarih();
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
	}
}
