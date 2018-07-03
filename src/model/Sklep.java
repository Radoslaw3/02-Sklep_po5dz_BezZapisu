package model;

import java.io.Serializable;
import java.util.*;

public class Sklep implements Serializable {
    //składowe
//    private Komputer komputer;
//    private List<>                //powyzej ArrayList
    private Collection<Komputer> komputery;    //to jest tylko referencja    //poszlismy wyzej //koleckcja obiektow typy(klasy) Komputer
    private String nazwa;

    //konstruktor
//    public Sklep(Collections<Komputer> komputery, String nazwa) { //automat zle wstawil kolekcje
    public Sklep(String nazwa){
        this.komputery = new ArrayList<>();     //to wrzycimy do kolekcji collection, bo jest ponizej na diagramie
        this.nazwa = nazwa;
    }

    //metody                    //mamy dodac 1en komputer
    public void dodajKomputer(Komputer komputer) {
        komputery.add(komputer);
    }

    public void usunKomputer(long id) {
//        if(komputery.contains(id))
//            komputer.                           //jak usunąć obiekt komputera w senssie jedno id
        Iterator<Komputer> iterator = komputery.iterator(); //z kolekcji komputer pobieramy sobie iterator , taki obiekt z naszej kolekcji czyli nie dotykamy tej kladki bezposrednio, tylko na nia sie "patrzymy"
        //posiada metody: next, hasnext, remove
        while (iterator.hasNext()){   //sprawdzamy czy ma nastepny element, czy jest szczebelek na ktorym moge stanac
            Komputer komputer = iterator.next(); //zwraca element i robi krok dalej(przeskok na anstepny element)
            if (komputer.getId() == id){
                iterator.remove();
            }
        }
    }

    public void wyswietl() {
/*                              Wojtek mowi e tak sie nie da:
        for (int i = 0; i < komputery.size(); i++) {
            komputery.add(i);
        }  */
        for (Komputer tmp : komputery){     //syntacti sugar sie nazywa(czyli jakas instrukcja ktora jest nakladka na jakas funkcje), to jest nakladka na ten iterator powyzej
            System.out.println(tmp);
        }
    }
}
