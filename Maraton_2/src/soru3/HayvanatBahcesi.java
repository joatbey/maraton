package soru3;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class HayvanatBahcesi {
	Map<String, Hayvan> hayvanlar = new HashMap<>();
	Set<String> hayvanAdlari = new HashSet<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		if (isDuplicateAnimal(memeliHayvan)) {
			System.out.println("Bu isimde bir hayvan mevcut hayvan isimleri unique olmalı");
		} else {
			hayvanlar.put(memeliHayvan.getAd(), memeliHayvan);
		}
	}

	public void bahceyeSurungenEkle(Surungen surungen) {
		if (isDuplicateAnimal(surungen)) {
			System.out.println("Aynı isimli bir hayvan mevcut hayvanat bahçesine eklenemedi");
		} else {
			hayvanlar.put(surungen.getAd(), surungen);
		}
	}

	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
	}

	public void hayvaninCinsiniBul(String ad) {
		String message = "";
		if (hayvanlar.get(ad) != null) {
			message = hayvanlar.get(ad).getAd() + " bir " + hayvanlar.get(ad).getUstSinifAdi();
		} else
			message = ad + " isimli hayvan Hayvanat Bahçesinde yok";
		System.out.println(message);

	}

	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		if (hayvanlar.get(hayvanAdi) != null)
			System.out.println(hayvanlar.get(hayvanAdi));
		else
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
	}

	public void hayvaniHareketEttir(String ad) {
		if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("aslan")) {
			Aslan tempAslan = (Aslan) hayvanlar.get(ad);
			tempAslan.yuru();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("yilan")) {
			Yilan tempYilan = (Yilan) hayvanlar.get(ad);
			tempYilan.surun();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("kertenkele")) {
			Kertenkele tempKertenkele = (Kertenkele) hayvanlar.get(ad);
			tempKertenkele.surun();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("maymun")) {
			Maymun tempMaymun = (Maymun) hayvanlar.get(ad);
			tempMaymun.yuru();
		}

	}

	public boolean isDuplicateAnimal(Hayvan hayvan) {
		boolean isAnyWithSameName = !hayvanAdlari.add(hayvan.getAd());
		return isAnyWithSameName;

	}

}