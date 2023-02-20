package lesson011.helper;

import java.util.Random;

public class RandomGenerateID {

	public static String generateId() {
		Random random = new Random();
		int randomSayi = random.nextInt(1000,10000);
		String randomSayiToString = Integer.toString(randomSayi);
		return randomSayiToString;
	}
	
	// product ismine göre product code oluşturuyorum
	public static String generateProductCode(String name) {
		
		String code = generateId();
		String newCode = name.substring(0, 3) + code;
		return newCode;
	}
	
	
	// aşağıdaki Berk'in string builder kodu
	public static String generateProductCode3(String productName) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(productName.substring(0,3));
		sb.append(Integer.toString(random.nextInt(100,1000)));
		return sb.toString();
		
	}
	
	//aşağıdaki Berk'in  STRINgBUILDER'SIZ kodu :   
	public static String generateProductCode4(String productName) {
		Random random = new Random();
		String randomCode = Integer.toString(random.nextInt(100,1000));
		return productName.substring(0,3) + randomCode;
		}
}
