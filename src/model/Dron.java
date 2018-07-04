package model;

import java.math.BigDecimal;

public class Dron extends Produkt {

    private double zasieg;
    private String czyMaKamere;

    public Dron(String nazwa_dron, BigDecimal cena_dron, double zasieg_dron, String czyMaKamere_dron) {
        super(nazwa_dron, cena_dron);
        this.zasieg = zasieg_dron;
        this.czyMaKamere = czyMaKamere_dron;
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
                "zasieg=" + zasieg +
                ", czyMaKamere=" + czyMaKamere +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
