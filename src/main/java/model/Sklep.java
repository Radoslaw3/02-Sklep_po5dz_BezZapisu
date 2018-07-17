package model;

import java.io.Serializable;
import java.util.*;

public class Sklep implements Serializable {
    //składowe

    private String nazwa;
    private Collection<Produkt> zbiornik;
   // public ArrayList<String> sortuj = new ArrayList<String>();



    public Sklep() {}
       //JSON: musialem dodac pusty konstructor bo krzyczal ponizszy blad:
//    java.io.EOFException: No content to map to Object due to end of input
//    at org.codehaus.jackson.map.ObjectMapper._initForReading(ObjectMapper.java:1630)

    //konstruktor
//    public Sklep(Collections<Komputer> zbiornik, String nazwa) { //automat zle wstawil kolekcje
    public Sklep(String nazwa){
        this.zbiornik = new ArrayList<>();     //to wrzycimy do kolekcji collection, bo jest ponizej na diagramie
        this.nazwa = nazwa;
    }

    //metody                    //mamy dodac 1en komputer
    public void dodaj(Produkt produkt) {
        System.out.println("A tak wyglada komputer po przeksztalceniu na Produkt: " + produkt);

        zbiornik.add(produkt);
    }

    public void usunKomputer(long id) {
//        if(zbiornik.contains(id))
//            komputer.                           //jak usunąć obiekt komputera w senssie jedno id
        Iterator<Produkt> iterator = zbiornik.iterator(); //z kolekcji komputer pobieramy sobie iterator , taki obiekt z naszej kolekcji czyli nie dotykamy tej kladki bezposrednio, tylko na nia sie "patrzymy"
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
        for (int i = 0; i < zbiornik.size(); i++) {
            zbiornik.add(i);
        }  */
        for (Produkt tmp : zbiornik){     //syntacti sugar sie nazywa(czyli jakas instrukcja ktora jest nakladka na jakas funkcje), to jest nakladka na ten iterator powyzej
            System.out.println(tmp);
        }
//        Collections.sort(zbiornik,null);
//        for (Produkt tmp : zbiornik){     //syntacti sugar sie nazywa(czyli jakas instrukcja ktora jest nakladka na jakas funkcje), to jest nakladka na ten iterator powyzej
//            System.out.println(tmp);
//        }
    }

//    public void komparatorPosortowaneCenowo(){
//        List<Produkt> kopiazbiornik = new ArrayList<>(zbiornik);
//        Collections.sort(kopiazbiornik);
//        for (Produkt tmp : kopiazbiornik){     //syntacti sugar sie nazywa(czyli jakas instrukcja ktora jest nakladka na jakas funkcje), to jest nakladka na ten iterator powyzej
//            System.out.println(tmp);
//        }
//
//    }


    public Collection<Produkt> getZbiornik() {
        return zbiornik;
    }

    public String getNazwa() {
        return nazwa;
    }
}
