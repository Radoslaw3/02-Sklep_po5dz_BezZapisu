package model;

import java.math.BigDecimal;

public class Komputer extends Produkt {

    //skladowe
    private long id;  //dodaje generatorId ponizej
    private String nazwa;
    private BigDecimal cena;              //dok ladna wartość zawsze...tekst z jaka dokladnoscia chcecie wykonac ta operacje musicie podac

    private String marka;
    private int ram;                //2 4 6 // private po to abysmy mogli je zahermetyzowac, aby ktos z naszego zespolu tego nie zmienil

    private static long generatorId = 0L;  //dodaje static

    public Komputer(String nazwa, BigDecimal cena, String marka, int ram) {

        //this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.marka = marka;
        this.ram = ram;
        generatorId++;          //kazdy dodawany Komputer do naszej kolekcji dostanie nowe Id. +1
        this.id = generatorId;
    }

    public long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public String getMarka() {
        return marka;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", marka='" + marka + '\'' +
                ", ram=" + ram +
                '}';
    }
}
