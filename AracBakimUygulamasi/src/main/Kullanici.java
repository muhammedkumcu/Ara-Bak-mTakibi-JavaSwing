package main;


import java.util.Map;

public class Kullanici {
    private String ad;
    private String soyad;
    private String model;
    private Map<String, Integer> bakimBilgileri;

    public Kullanici() {
        
    }
    public Kullanici(String ad, String soyad, String model, Map<String, Integer> bakimBilgileri) {
        this.ad = ad;
        this.soyad = soyad;
        this.model = model;
        this.bakimBilgileri = bakimBilgileri;
    }

    // Getter ve Setter metodlarını ekleyin

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Map<String, Integer> getBakimBilgileri() {
        return bakimBilgileri;
    }

    public void setBakimBilgileri(Map<String, Integer> bakimBilgileri) {
        this.bakimBilgileri = bakimBilgileri;
    }
}
