package lesson005;

public class Question43 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4'ün kaç kere geçtiğini bulan
		// 2 ve 4ten hangisinin daha fazla olduğunu bulan program
		//  output -->> 4ler 2 lerden daha fazla dizinin içinde. 4 tane 4 sayısı vardır.
		
		// ÖDEV: hangi sayılar

		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		
		int counterFor2 = 0;
		int counterFor4 = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				counterFor2++;
			}
			else if (array[i] == 4){
				counterFor4++;
			}
		}
		if (counterFor2 > counterFor4) {
			System.out.println("Dizide 2 sayısı 4 sayısından daha fazladır. " + counterFor2 + " kere geçmektedir.");
		}
		else if (counterFor4 > counterFor2){
			System.out.println("Dizide 4 sayısı 2 sayısından daha fazladır. " + counterFor4 + " kere geçmektedir.");
		}
		else {
			System.out.println("Dizide 2 sayısı ve 4 sayısı eşit sayıda geçmektedir. " + counterFor4 + " kere geçmektedir.");
		}
		
		
	}

}
