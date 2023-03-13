package soru4;


import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {

	private boolean isVIP;
	private Map<String, Integer> biletlerBusinessMap;

	private final int BUSINESSFIYAT = 200;
	private final int BUSINESSVIPFIYAT = 150;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVIP) {
		super(id, ad, soyad);
		this.isVIP = isVIP;
		this.biletlerBusinessMap = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Business Yolcusu "+getAd()+" "+ getSoyad()+" Biletleri "+ biletlerBusinessMap );

	}

	@Override
	public void biletAl(EFirmaAdi eFirmaAdi) {
		String mesaj = "";
		int biletFiyati;
		if (isVIP()) {
			biletFiyati = BUSINESSFIYAT + BUSINESSVIPFIYAT + getBASEFIYAT();
			biletlerBusinessMap.put(eFirmaAdi.toString(), biletFiyati);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString() + " için VIP bilet alınmıştır  -->"
					+ biletlerBusinessMap;
		} else {
			biletFiyati = BUSINESSFIYAT + getBASEFIYAT();
			biletlerBusinessMap.put(eFirmaAdi.toString(), biletFiyati);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString() + " için bilet alınmıştır  -->"
					+ biletlerBusinessMap;
		}
		int sayi = (int)(Math.random()*biletNumaraları.size());
		setKoltukNo(biletNumaraları.get(sayi));
		biletNumaraları.remove(sayi);
		System.out.println(mesaj);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " için check-in yapılmış, uçağa binebilirsiniz");
		} else {
			System.out.println("Checkin işlemi gerçekleştirildi... Şimdi uçağa binebilirsiniz ");
			setCheckIn(true);
		}

	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("Check-in yapmadan uçağa binemezsiniz lütfen check-in yapınız...");
		} else
			System.out.println(getAd() + " "+ getKoltukNo() + " bilgileri ile uçağa binebilirsiniz");

	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isBusiness) {
		this.isVIP = isBusiness;
	}

	public Map<String, Integer> getBiletler() {
		return biletlerBusinessMap;
	}
}