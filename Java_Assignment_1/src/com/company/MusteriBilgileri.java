package com.company;

public class MusteriBilgileri {

    private long tcKimlik;
    private String adSoyad;
    private float hesapBakiyesi;

    ParaIslemleri paraIslemleri = new ParaIslemleri();

    public void musteriBilgilendirme() {
        System.out.println("T.C Kimlik Numarası: " + tcKimlik);
        System.out.println("İsim Soyisim: " + adSoyad);
        System.out.println("Hesap Bakiyesi: " + hesapBakiyesi);
    }

    public void ParaYatırma(float paraMiktarı) {
        this.hesapBakiyesi = paraIslemleri.paraYatırma(hesapBakiyesi, paraMiktarı);
        System.out.println("Güncel hesap bakiyeniz: " + hesapBakiyesi);
    }

    // Yapılmak istenilen işleme ve para miktarına göre hesap bakiyesinin son durumunun gösterilmesi.

    public void ParaCekme(float paraMiktarı) {
        this.hesapBakiyesi = paraIslemleri.paraCekme(hesapBakiyesi, paraMiktarı);
        System.out.println("Güncel hesap bakiyeniz: " + hesapBakiyesi);
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
