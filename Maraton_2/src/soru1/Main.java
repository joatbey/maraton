package soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


	static HashMap<String, String> rehber = new HashMap<>(); // Hızlı sonuç için hashmap
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		// dosyayiOkuVeYaz()
		main.dosyayiOkuVeYaz();
		// girdiyiFormatla()
		String key = main.adSoyadAlFormatla(); 
		// anahtarDeğeriniYazdır()
		main.anahtarDeğeriniYazdır(key);

	}

	public void dosyayiOkuVeYaz() {
 
		Main main = new Main();


		try (BufferedReader reader = new BufferedReader(new FileReader("rehber.txt"))) {

			String s = null;
			while ((s = reader.readLine()) != null) {
				rehber.put(main.girdiyiFormatla(s)[0], main.girdiyiFormatla(s)[1]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Girdiğiniz dosya aadı ve ya yolunu kontrol ediniz (FileNotFoundException)");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

	public String[] girdiyiFormatla(String string) {
		String[] splittedStr = string.split(";");
		String[] str = { splittedStr[0].trim(), splittedStr[2].trim() };// Ad Soyad , telNo
		return str;
	}

	public String adSoyadAlFormatla() {
		System.out.print("Lütfen kişinin adını giriniz: ");
		String adi = scanner.nextLine().trim();
		System.out.print("Lütfen kişinin soyadını giriniz: ");
		String soyadi = scanner.nextLine().trim();
		
		
		
		String key = "";
		try {
			// ilk harf buyuk diger harfler kucuk olacak sekilde formatı belirli hale getir...
			key = adi.substring(0, 1).toUpperCase() + adi.substring(1).toLowerCase() + " "
					+ soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1).toLowerCase();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Tek karakter ad veya soyad olamaz.");
		}

		return key;
	}

	public void anahtarDeğeriniYazdır(String key) {
		if (null == rehber.get(key)) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		} else {
			System.out.println(key + " isimli kişinin telefon numarası: " + rehber.get(key));
		}
	}

}