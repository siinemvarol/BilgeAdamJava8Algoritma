package lesson007;

public class Question54 {

	public static void main(String[] args) {
		// verilen dizide rakamların farkının en az olduğu sayıların farkını bulalım
		
		int[] array = { 1, -10, -4, 3 };
		
		
		int minimum = Integer.MAX_VALUE;		

			for (int i = 0; i < array.length-1; i++) {
				for (int j = 0; j < array.length; j++) {
					if ((i != j) && minimum > (Math.abs(array[i] - array [j])) ) {
						minimum = Math.abs(array[i] - array [j]);
					}
				}
				
				
//				if (i != array.length-1) {
//					fark[i] = Math.abs(array[i] - array [i+1]); 
//				}
//				else if (i == array.length-1) {
//					condition = false;
//				}
			}
		
		
//		for (int i = 0; i < fark.length; i++) {
//			System.out.println(fark[i]);
//		}
//		
//		int minimum = fark[0];
//		System.out.println();
//		
//		for (int i = 0; i < fark.length; i++) {
//			if (fark[i] < minimum) {
//				minimum = fark[i];
//			}
//			
//		}
		System.out.println("Minimum fark: " + minimum);

	}

}
