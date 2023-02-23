package lesson014;

public class AccountManager {

	public void depositMoney(Account account, int money) {		
		if (money > 0 && money <= 10000) {
			account.setMoney(account.getMoney() + money);
			System.out.println(money + " TL hesabınıza yatırıldı. Hesap bakiyesi: " + account.getMoney());
		} else {
			System.err.println("Sadece 1 TL - 10.000 TL yatırabilirsiiz.");
		}

	}

	public void withdrawMoney(Account account, int money) {
		if (money <= account.getMoney()) {
			account.setMoney(account.getMoney() - money);
			System.out.println(money + " TL hesabınızdan çekildi. Hesap bakiyesi: " + account.getMoney());
		} else {
			System.err.println("Hesap bakiyeniz yeterli değildir");
		}
	}
	
	public void accountDetails(Account account) {
		System.out.println("Hesap no: " + account.getAccountNo() + "\nHesap bakiyesi: " + account.getMoney());
	}
	
	
}
