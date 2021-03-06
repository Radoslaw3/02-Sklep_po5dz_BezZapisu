package model;

import java.math.BigDecimal;

public class Dron extends Produkt {

    private double zasieg;
    private String czyMaKamere;

    public Dron() {
    }

    public Dron(String nazwa, BigDecimal cena, double zasieg, String czyMaKamere) {
        super(nazwa, cena);
        this.zasieg = zasieg;
        this.czyMaKamere = czyMaKamere;
    }

    public double getZasieg() {
        return zasieg;
    }

    public String getCzyMaKamere() {
        return czyMaKamere;
    }

    @Override
    public String toString() {
        return "Dron{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", zasieg=" + zasieg +
                ", czyMaKamere=" + czyMaKamere +
                '}';
    }
}
