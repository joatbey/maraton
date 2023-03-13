package soru3;


public class Kertenkele extends Surungen {
	private String sinifAdi;

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Kertenkele";
		setUstSinifAdi("Sürüngen");
	}

	@Override
	public void surun() {
		System.out.println(getAd()+" isimli "+sinifAdi+ " surunuyor...");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " tısslıyor ...");
		
	}
	public String getSinifAdi() {
		return sinifAdi;
	}

}