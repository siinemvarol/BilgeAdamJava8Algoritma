package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// Telefona ve maile bir kod gelecek. bu kodları biz tanımlayacağız
		// kullanıcıdan maile ve telefona gelen kodu isteyeceğiz
		// kullanıcının telefonuna ve mailine gelen kod uyuşuyorsa sisteme kayıt oldunuz diyelim
		// hata varsa maile gelen kod, telefona gelen kod, her ikisi de hatalı deyip bilgilendireceğiz
		
		int telefonKodu = 123456;
		int mailKodu = 567890;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Telefona gelen altı basamaklı kodu giriniz: ");
		int telefonGirilen = scanner.nextInt();
		
		System.out.println("Maile gelen altı basamaklı kodu giriniz: ");
		int mailGirilen = scanner.nextInt();
		
		if (telefonKodu == telefonGirilen && mailKodu == mailGirilen) {
			System.out.println("Sisteme kaydoldunuz!");
		}
		else if (telefonKodu == telefonGirilen && mailKodu != mailGirilen) {
			System.out.println("Maile gelen kod hatalıdır.");
		}
		else if (telefonKodu != telefonGirilen && mailKodu == mailGirilen) {
			System.out.println("Telefona gelen kod hatalıdır.");
		}
		else {
			System.out.println("Her ikisi de hatalıdır.");
		}
		

	}

}
