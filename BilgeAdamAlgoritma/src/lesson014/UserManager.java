package lesson014;

public class UserManager {

	private final String emailFormat = "@xbanka.com";

	public void generateAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(' ', '.') + "." + user.getSurname().toLowerCase() + emailFormat);
	}
	// replace ( değiştirilmesi istenen, neyle değiştireceğiz);
	// replace(' ', '.') yerine replace(" ", ".") de olabilir

	// alternatif metod aşağıda
	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;

		user.setEmail(otomatikOlusanEmail);

		System.out.println(otomatikOlusanEmail);
	}
	
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		
		System.out.println(para + " TL için kredi başvurusunda bulundunuz..");
		System.out.println("başvuru sonucu bekleniyor..");

	}

}
