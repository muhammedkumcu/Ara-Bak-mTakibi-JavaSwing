package main;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Islemler {
    public static LinkedList<Kullanici> globalUserList = new LinkedList<>();
    // Başlangıçtaki bakım sürelerini tutacak Map
    private Map<String, Integer> baslangicBakimSuresi = new HashMap<>();
    
    public Islemler() {
        dosyaOkumaKB();
        // Başlangıçtaki bakım sürelerini ayarla
        for (Kullanici kullanici : globalUserList) {
            Map<String, Integer> bakimBilgileri = kullanici.getBakimBilgileri();
            for (Map.Entry<String, Integer> entry : bakimBilgileri.entrySet()) {
                baslangicBakimSuresi.put(kullanici.getAd(), entry.getValue());
            }
        }
    }
    
    // 1 Ay İlerleme Fonksiyonu
    public void birAyIlerle() {
        for (Kullanici kullanici : globalUserList) {
            Map<String, Integer> bakimBilgileri = kullanici.getBakimBilgileri();
            for (Map.Entry<String, Integer> entry : bakimBilgileri.entrySet()) {
                int yeniSure = entry.getValue() - 1;
                
                entry.setValue(yeniSure); // Yeni süreyi ayarla
            }
        }
    }
    
    // Bakımı Tamamla Fonksiyonu
    public void bakimiTamamla() {
        for (Kullanici kullanici : globalUserList) {
            Map<String, Integer> bakimBilgileri = kullanici.getBakimBilgileri();
            for (Map.Entry<String, Integer> entry : bakimBilgileri.entrySet()) {
                // Başlangıç süresini alarak güncelle
                entry.setValue(baslangicBakimSuresi.get(kullanici.getAd()));
            }
        }
    }
    
    protected void dosyaOkumaKB() {
    // Personel listesini oluştur
    LinkedList<Kullanici> tempUserList = new LinkedList<>();

    // Dosyadan verileri oku, Kullanici nesnelerini oluştur ve listeye ekle
    try (BufferedReader reader = new BufferedReader(new FileReader("src/Data/kullaniciBilgileri"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String ad = parts[0].trim();
            String soyad = parts[1].trim();
            String model = parts[2].trim();
            
            Map<String, Integer> bakimBilgileri = new HashMap<>();
            bakimBilgileri.put("Yağ Değişim", Integer.parseInt(parts[3].trim()));
            bakimBilgileri.put("Filtre Değişim", Integer.parseInt(parts[4].trim()));
            bakimBilgileri.put("Lastik Rotasyonu", Integer.parseInt(parts[5].trim()));
            bakimBilgileri.put("Fren Balata Değişimi", Integer.parseInt(parts[6].trim()));
            bakimBilgileri.put("Akü Değişimi", Integer.parseInt(parts[7].trim()));

            Kullanici kullanici = new Kullanici(ad, soyad, model, bakimBilgileri);
            tempUserList.add(kullanici);
        }
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
    }

    // Global personel listesini güncelle
    globalUserList = tempUserList;
}

    
    protected void dosyaYazdirmaKB() {
    // Dosyayı temizle
    try (BufferedWriter cleanWriter = new BufferedWriter(new FileWriter("src/Data/kullaniciBilgileri", false))) {
        cleanWriter.write("");
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Dosyaya yazdır
    for (Kullanici kullanici : globalUserList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Data/kullaniciBilgileri", true))) {
            Map<String, Integer> bakimBilgileri = kullanici.getBakimBilgileri();
            writer.write(kullanici.getAd() + "," + kullanici.getSoyad() + "," + kullanici.getModel() + "," +
                         bakimBilgileri.get("Yağ Değişim") + "," +
                         bakimBilgileri.get("Filtre Değişim") + "," +
                         bakimBilgileri.get("Lastik Rotasyonu") + "," +
                         bakimBilgileri.get("Fren Balata Değişimi") + "," +
                         bakimBilgileri.get("Akü Değişimi"));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    
    protected void bakimListesiniOkuma() {
        
    }
   
    
    // Kullanıcı girişi için data okuma
    boolean girisYapK(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/data/kullanicilar"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] parts = satir.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Admin girişi için data okuma
    boolean girisYapA(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/data/adminler"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] parts = satir.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }   
    
}
