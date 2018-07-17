package pliki;

import model.Sklep;
import java.io.IOException;

public interface OperacjePlikowe {
     public abstract void zapisz(Sklep sklep) throws Exception;
     public Sklep wczytaj() throws IOException, ClassNotFoundException;

    // od Java 8
    default void wyswietl() {

    }
}
