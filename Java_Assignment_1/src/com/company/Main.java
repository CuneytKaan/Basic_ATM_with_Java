package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        KurumsalMusteri kurumsalMusteri1 = new KurumsalMusteri();
        KurumsalMusteri kurumsalMusteri2 = new KurumsalMusteri();
        BireyselMusteri bireyselMusteri1 = new BireyselMusteri();
        BireyselMusteri bireyselMusteri2 = new BireyselMusteri();
        BireyselMusteri bireyselMusteri3 = new BireyselMusteri();
        MusteriBilgileri secilenMusteri = null;
        // Switch-Case'de müşteri numarasına göre seçilen hesap üzerinden işlem yapabilmek için.

        kurumsalMusteri1.setTcKimlik(1111111223);
        kurumsalMusteri1.setAdSoyad("Cüneyt Kaan Uğurerkan");
        kurumsalMusteri1.setHesapBakiyesi(7700);
        kurumsalMusteri1.setSirketAdi("Testinium");

        kurumsalMusteri2.setTcKimlik(1111111224);
        kurumsalMusteri2.setAdSoyad("Halil Kaan Çeliker");
        kurumsalMusteri2.setHesapBakiyesi(6600);
        kurumsalMusteri2.setSirketAdi("Testinium");

        bireyselMusteri1.setTcKimlik(1111111225);
        bireyselMusteri1.setAdSoyad("İpek Firikci");
        bireyselMusteri1.setHesapBakiyesi(5500);
        bireyselMusteri1.setEvAdresi("Beyazevler");

        bireyselMusteri2.setTcKimlik(1111111226);
        bireyselMusteri2.setAdSoyad("Akın Kazar");
        bireyselMusteri2.setHesapBakiyesi(4400);
        bireyselMusteri2.setEvAdresi("Meydan");

        bireyselMusteri3.setTcKimlik(1111111227);
        bireyselMusteri3.setAdSoyad("Ceyda Sanlikun");
        bireyselMusteri3.setHesapBakiyesi(3300);
        bireyselMusteri3.setEvAdresi("Medline");
        // Müşteri bilgilerinin atanması.

        Map<String, MusteriBilgileri> hesapBilgileri = new HashMap<>();
        hesapBilgileri.put("01", kurumsalMusteri1);
        hesapBilgileri.put("02", kurumsalMusteri2);
        hesapBilgileri.put("03", bireyselMusteri1);
        hesapBilgileri.put("04", bireyselMusteri2);
        hesapBilgileri.put("05", bireyselMusteri3);
        // Her müşteriye unique numara atanması için HashMap.

        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen müşteri numaranızı giriniz : ");
        String musteriNo = in.nextLine();

        switch (musteriNo) {
            case "01":
                hesapBilgileri.get("01").musteriBilgilendirme();
                secilenMusteri = hesapBilgileri.get("01");
                break;
            case "02":
                hesapBilgileri.get("02").musteriBilgilendirme();
                secilenMusteri = hesapBilgileri.get("02");
                break;
            case "03":
                hesapBilgileri.get("03").musteriBilgilendirme();
                secilenMusteri = hesapBilgileri.get("03");
                break;
            case "04":
                hesapBilgileri.get("04").musteriBilgilendirme();
                secilenMusteri = hesapBilgileri.get("04");
                break;
            case "05":
                hesapBilgileri.get("05").musteriBilgilendirme();
                secilenMusteri = hesapBilgileri.get("05");
                break;
            default:
                System.out.println("Müşteri numaranızı yanlış girdiniz!");
                System.exit(0);
        }
        // Unique keylere göre bilgilerin gösterilmesi.

        System.out.print("Para yatırmak için 1'i, para çekmek için 2'yi tuşlayınız : ");
        int paraIslemi = in.nextInt();
        System.out.print("Para miktarını giriniz : ");
        float paraMiktari = in.nextFloat();

        if (paraIslemi == 1) {
            secilenMusteri.ParaYatırma(paraMiktari);
        } else if (paraIslemi == 2) {
            secilenMusteri.ParaCekme(paraMiktari);
        } else {
            System.out.println("Hatalı tuşlama yaptınız!");
        }
        // Girilen değerlere göre işlem ve miktar belirleme.
    }
}
