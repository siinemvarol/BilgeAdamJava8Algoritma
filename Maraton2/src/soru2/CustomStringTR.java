package soru2;

public class CustomStringTR {
	
	private String ifade;
	
	public CustomStringTR(String ifade) {
		this.ifade = ifade;
	}
	
	public int uzunluk() {
		return ifade.length();
	}
	
	public boolean sHarfiniIceriyorMu() {
		return ifade.contains("s");
	}
	
	public char ilkKarakter() {
		return ifade.charAt(0);
	}
	
	public String buyukHarfeCevir() {
		return ifade.toUpperCase();
	}
	
	public String ucKereTekrarEt() {
		return ifade.repeat(3);
	}
	
	public String sHarfiniTIleDegistir() {
		return ifade.replaceAll("s", "t");
	}
	
	public String bosluklariTemizle() {
		return ifade.trim();
	}
	
	public String ikinciIndextenSubstringAl() {
		return ifade.substring(2);
	}
	
	public String kucukHarfeCevir() {
		return ifade.toLowerCase();
	}
		
	public int hashKodu() {
		return ifade.hashCode();
	}
	

	public static void main(String[] args) {
		
		CustomStringTR ifade = new CustomStringTR("sinem");
		
		System.out.println("1 - " + ifade.uzunluk());
		System.out.println("2 - " + ifade.sHarfiniIceriyorMu());
		System.out.println("3 - " + ifade.ilkKarakter());
		System.out.println("4 - " + ifade.buyukHarfeCevir());
		System.out.println("5 - " + ifade.ucKereTekrarEt());
		System.out.println("6 - " + ifade.sHarfiniTIleDegistir());
		System.out.println("7 - " + ifade.bosluklariTemizle());
		System.out.println("8 - " + ifade.ikinciIndextenSubstringAl());
		System.out.println("9 - " + ifade.kucukHarfeCevir());
		System.out.println("10 - " + ifade.hashKodu());
					
	}

}
