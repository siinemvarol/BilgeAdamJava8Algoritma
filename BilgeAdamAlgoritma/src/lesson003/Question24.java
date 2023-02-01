package lesson003;

public class Question24 {

	public static void main(String[] args) {
		// 1den 100e kadar olan çift sayıların toplamının tek sayıların toplamına oranını bulan program
		
		float additionEvenNumbers = 0;
		float additionOddNumbers = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 1) {
				additionOddNumbers = additionOddNumbers + i;
				System.out.println("Addition of odd numbers is: " +additionOddNumbers);
			}
			else {
				additionEvenNumbers = additionEvenNumbers + i;
				System.out.println("Addition of even numbers is: " + additionEvenNumbers);
			}
		}
		 float rate = additionEvenNumbers / additionOddNumbers;
		System.out.println("Oran: " + rate );

	}

}
