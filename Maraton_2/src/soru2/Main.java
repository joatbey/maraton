package soru2;
public class Main {
	public static void main(String[] args) {
		CustomStringTR customStr = new CustomStringTR("Merhaba");

		System.out.println(customStr.ayni("er"));
		
		System.out.println(customStr.ayniKarakterFarketmez("er"));
		
		System.out.println(customStr.buyukHarfYap());

		System.out.println(customStr.kucukHarfYap());
		
		System.out.println(customStr.ileMiBasliyor("mer"));
		
		System.out.println(customStr.ileMiBitiyor("aba"));
		
		System.out.println(customStr.indextekiKarakter(2));
		
		System.out.println(customStr.karakterDizisi());
		
		System.out.println(customStr.stringIndexi("rha"));
		
		System.out.println(customStr.uzunluk());
	}
}