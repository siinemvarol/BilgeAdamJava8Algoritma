package lesson014;

public class AdminManager {
	
	public void krediBasvurusunuOnayla(Account account) {
		if(account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır!");
			account.setMoney(account.getMoney() + account.getIstenenKredi());
			account.setKrediBasvurusu(false);
			account.setIstenenKredi(0);
		}
		else {
			System.err.println("Bu hesaba ait kredi başvurusu bulunamadı.");
		}
	}
	// üstteki metodun aynısı User parametrelisi
	public void krediBasvurusunuOnayla(User user) {
		if(user.getAccount().isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır!");
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKredi());
			user.getAccount().setKrediBasvurusu(false);
			user.getAccount().setIstenenKredi(0);
		}
		else {
			System.err.println("Bu hesaba ait kredi başvurusu bulunamadı.");
		}
	}
	
	public void krediBasvurusunuReddet(Account account) {
		if(account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz reddedildi..");
			account.setKrediBasvurusu(false);
			account.setIstenenKredi(0);
		}
		else {
			System.err.println("Bu hesaba ait kredi başvurusu bulunamadı.");
		}
	}

}
