package soru3;


public class Aslan extends MemeliHayvan {
	private String sinifAdi;

	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Aslan";
		setUstSinifAdi("Memeli Hayvan");
		setTehlikeliMi(true);
	}

	@Override
	public void yuru() {
		System.out.println(getAd() + " isimli " + sinifAdi + " yürüyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " kükrüyor...");

	}

	public String getSinifAdi() {
		return sinifAdi;
	}

}