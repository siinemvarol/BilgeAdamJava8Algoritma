package lesson019;

public class Main {

	// program bize random bir plaka sunacak
	// hashMap olacrak tutacağız (plaka, şehir)
	// oyunSayisi
	// 3 hakkımız var her turda kalan hakkımızı göstersin
	// tahminleri tutup göstermek için -> hashMap(oyunSayisi, List<String>

	// PlakaTahmin diye sinif oluşturalım
	// mapOlustur diye metod yazalım

	// tahmin metodunu yazalım
	// kullanıcıdan şehir tahmini alıcaz
	// kullanıcının her yaptığı tahmini bu metod içinde bir ArrayList oluşturup
	// içine atacağız. eğer doğru bilirse döngüden çıkacağız. kaçıncı tahminde
	// bildiğini söyleyeceğiz. hem tahmin listesi hem oyun sayısını tahminler
	// arrayList'ine atacğız ve oyun sayısını bir arttıracağız.
	// her tahminden sonra yanlış bilirsek tahmin hakkımız güncellensin
	// her turda kaç tahmin hakkımız kaldığını yazsın ve 3 kere yanlış bildiysek
	// 2. oyuna geçsin ve tahminler güncellensin

	public static void main(String[] args) {

		OyunuBaslat.menu();

	}

}
