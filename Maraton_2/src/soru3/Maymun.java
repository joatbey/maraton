package soru3;

public class Maymun extends MemeliHayvan {
	private String sinifAdi;

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Maymun";
		setUstSinifAdi("Memeli Hayvan");
	}

	@Override
	public void yuru() {
		System.out.println(getAd() + " isimli " + sinifAdi + " yürüyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " maymun sesi çıkarıyor...");

	}

	public String getSinifAdi() {
		return sinifAdi;
	}

}