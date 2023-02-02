package lesson004;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// verilen kelimelerin harflerini alt alta yazdıralım: java
		
		String text = "java";
		
		for (int i=0; i <text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		// Kullanıcıdan string değer alalım. aldığımız değeri (java için örnek:)
		// 0. indexi -> j
		// 1. indexi -> a ...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime giriniz: ");
		String word = scanner.nextLine();
		
		for (int j=0; j <word.length(); j++) {
			System.out.println(j + ". index: " +word.charAt(j));
		}
		
		

	}

}
