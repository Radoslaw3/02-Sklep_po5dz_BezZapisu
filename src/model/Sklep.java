package model;

import java.io.Serializable;
import java.util.*;

public class Sklep implements Serializable {
    //składowe

    private String nazwa;
    private Collection<Produkt> produkty;

    //konstruktor
//    public Sklep(Collections<Komputer> produkty, String nazwa) { //automat zle wstawil kolekcje
    public Sklep(String nazwa){
        this.produkty = new ArrayList<>();     //to wrzycimy do kolekcji collection, bo jest ponizej na diagramie
        this.nazwa = nazwa;
    }

    //metody                    //mamy dodac 1en komputer
    public void dodaj(Produkt produkt) {
        produkty.add(produkt);
    }

    public void usunKomputer(long id) {
//        if(produkty.contains(id))
//            komputer.                           //jak usunąć obiekt komputera w senssie jedno id
        Iterator<Produkt> iterator = produkty.iterator(); //z kolekcji komputer pobieramy sobie iterator , taki obiekt z naszej kolekcji czyli nie dotykamy tej kladki bezposrednio, tylko na nia sie "patrzymy"
        //posiada metody: next, hasnext, remove
        while (iterator.hasNext()){   //sprawdzamy czy ma nastepny element, czy jest szczebelek na ktorym moge stanac
            Produkt komputer = iterator.next(); //zwraca element i robi krok dalej(przeskok na anstepny element)
            if (komputer.getId() == id){
                iterator.remove();
            }
        }
    }

    public void wyswietl() {
/*                              Wojtek mowi e tak sie nie da:
        for (int i = 0; i < produkty.size(); i++) {
            produkty.add(i);
        }  */
        for (Produkt tmp : produkty){     //syntacti sugar sie nazywa(czyli jakas instrukcja ktora jest nakladka na jakas funkcje), to jest nakladka na ten iterator powyzej
            System.out.println(tmp);
        }
    }


}
