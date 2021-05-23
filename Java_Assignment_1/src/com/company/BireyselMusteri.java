package com.company;

public class BireyselMusteri extends MusteriBilgileri {

    private String evAdresi;

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    public void musteriBilgilendirme() {
        super.musteriBilgilendirme();
        System.out.println("Ev Adresi: " + evAdresi);
    }

}
