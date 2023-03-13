package soru3;

public class Yilan extends Surungen {
	private String sinifAdi;

	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Yılan";
		setUstSinifAdi("Sürüngen");
		setTehlikeliMi(true);
	}

	@Override
	public void surun() {
		System.out.println(getAd() + " isimli " + sinifAdi + " surunuyor...");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " tıssslıyor...");

	}
	

	public String getSinifAdi() {
		return sinifAdi;
	}

}