package com.company;

public class KurumsalMusteri extends MusteriBilgileri {

    private String sirketAdi;

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public void musteriBilgilendirme() {
        super.musteriBilgilendirme();
        System.out.println("Şirket Adı: " + sirketAdi);
    }


}
