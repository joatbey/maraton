package soru2;


public class CustomStringTR {
	private String string;
	
	
	public CustomStringTR(String string) {
		super();
		this.string = string;
	}
	
	
	//length
	public int uzunluk() {
		int uzunluk = string.length();
		return uzunluk;
	}
	
	//toCharArray
	public char[] karakterDizisi() {
		char[] dizi = string.toCharArray();
		return dizi;
	}
	
	//toLowerCase
	public String kucukHarfYap() {
		String kucuk = string.toLowerCase();
		return kucuk;
	}
	//toUpperCase
	public String buyukHarfYap() {
		String buyuk = string.toUpperCase();
		return buyuk;
	}
	
	//equals
	public boolean ayni(String str) {
		boolean AyniMi = string.equals(str);
		return AyniMi;
	}
	
	//equalsIgnoreCase
	public boolean ayniKarakterFarketmez(String str) {
		boolean AyniMiKarakterFarkEtmez = string.equalsIgnoreCase(str);
		return AyniMiKarakterFarkEtmez;
	}
	
	//charAt
	public char indextekiKarakter(int index) {
		char karakter = string.charAt(index);
		return karakter;
	}
	//endsWith
	public boolean ileMiBitiyor(String str) {
		boolean ileBitiyorMu = string.endsWith(str);
		return ileBitiyorMu;
	}
	
	// 
	public boolean ileMiBasliyor(String str) {
		boolean ileBasliyorMu = string.startsWith(str);
		return ileBasliyorMu;
	}
	
	public int stringIndexi(String str) {
		int index = string.indexOf(str);
		return index;
	}
	
	//getter setter methodları:
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}