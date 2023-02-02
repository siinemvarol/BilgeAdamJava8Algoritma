package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// kullanıcıdan email password repassword alalım
		// emailde '@hotmail.com' ya da '@outlook.com'yoksa: email formarına uygun değil
		// uygunsa password repassword karşılaştır, aynı değilse passwordler uyuşmyor
		// password min 8 karakter olsun
		
		Scanner scanner = new Scanner(System.in);
		
		boolean check = true;
		boolean check2 = true;
		boolean check3 = true;
		
		while(check == true) {
		System.out.println("Please enter your email address: ");
		String email = scanner.nextLine();
		
		while (check2 == true) {
		if (email.contains("@hotmail.com") || email.contains("@outlook.com")) {
			System.out.println("Please enter your password: ");
			String password = scanner.nextLine();
			check3 = true;
			
		while (check3 == true) {	
			if (password.length()>=8) {
				System.out.println("Please enter password again: ");
				String password2 = scanner.nextLine();
				if (password.equals(password2)) {
					System.out.println("You have successfully created a profile: " + email);
					check = false;
					check2 = false;
					check3 = false;
				}
				else {
					System.out.println("Passwords do not match.");
				}
			}
			else {
				System.out.println("Your password must be at least eight characters long.");
				check3 = false;
			}
		}
		}
		else
		{
			System.out.println("Your email address is not accepted.");
		}
		}
		
		}

	}

}
