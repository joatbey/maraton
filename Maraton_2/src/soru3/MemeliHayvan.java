package soru3;


public abstract class MemeliHayvan extends Hayvan {
	private String superClassAdi = "Memeli Hayvan";

	public MemeliHayvan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	public abstract void yuru();

	public String getUstSinifAdi() {
		return superClassAdi;
	}
}