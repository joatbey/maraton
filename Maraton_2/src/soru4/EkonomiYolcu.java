package soru4;



import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {
	private Map<String, Integer> biletlerEkonomiMap;
	private final int EKONOMIFIYAT = 100;

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		this.biletlerEkonomiMap = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+getAd()+" "+ getSoyad()+" Biletleri "+biletlerEkonomiMap );

	}

	@Override
	public void biletAl(EFirmaAdi eFirmaAdi) {
		String mesaj = "";
		int biletFiyati = EKONOMIFIYAT + getBASEFIYAT();
		
		if (biletlerEkonomiMap.containsKey(eFirmaAdi.toString())) {
			biletlerEkonomiMap.put(eFirmaAdi.toString(), biletlerEkonomiMap.get(eFirmaAdi.toString())+biletFiyati);
			mesaj = eFirmaAdi.toString() + " Havayolundan bilet alınmıştır-->" + biletlerEkonomiMap;
		} else {
			biletlerEkonomiMap.put(eFirmaAdi.toString(), biletFiyati);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString()
					+ " için Ekonomi sınıfından bilet alınmıştır  -->" + biletlerEkonomiMap;
		}
		setKoltukNo(biletNumaraları.get((int) (Math.random() * biletNumaraları.size())));
		biletNumaraları.remove((int) (Math.random() * biletNumaraları.size()));
		System.out.println(mesaj);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " için check-in yapılmış, uçağa binebilirsiniz");
		} else {
			System.out.println("Check-in işlemi gerçekleştirildi... ");
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

	public Map<String, Integer> getBiletler() {
		return biletlerEkonomiMap;
	}
}