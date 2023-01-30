package lesson001;

public class Question3 {

	public static void main(String[] args) {
		//verilen ürünün satış fiyatının içinde %18 ve %15 kar olduğunu biliyoruz
		//verilen ürünün ham fiyatını bulan program
		
		float satisFiyati = 100f;
		float kdv = 0.18f;
		float kar = 0.15f;
		float hamFiyati = satisFiyati - (satisFiyati * kdv) - (satisFiyati * kar);
		
		System.out.println("Ürünün ham fiyatı: " + hamFiyati);

	}

}