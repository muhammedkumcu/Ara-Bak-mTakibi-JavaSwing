package main;

import java.util.HashMap;
import java.util.Map;

public class ArabaBakimBilgileri {
    private String model;
    private Map<String, Integer> bakimBilgileri;

    public ArabaBakimBilgileri(String model) {
        this.model = model;
        this.bakimBilgileri = new HashMap<>();
    }

    public Map<String, Integer> getBakimBilgileri() {
        return bakimBilgileri;
    }

    public void setBakimBilgisi(String bakimTipi, int sure) {
        bakimBilgileri.put(bakimTipi, sure);
    }
}
