package controller;

import model.Dron;
import model.Komputer;
import model.Sklep;
import pliki.PlikiBinarne;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietlMenu(){     //stworz metode nic nie przyjmuje, nic nie zwraca

        Sklep sklep = new Sklep("www.amazon.com"); //utworz pusty Sklep(obiekt klasy sklep)
        //powyzsza linijka, po odpaleniu, stworzy jedynie pusta liste, bo konstruktor to zalatwil
        Scanner scr = new Scanner(System.in);
        System.out.println("1 - dodaj komputer");
        System.out.println("2 - usun komputer");
        System.out.println("3 - wyswietl liste komputerow");
        System.out.println("wyjdz");
        String wybor;

        do {
            System.out.println("Podaj wybor");
            wybor = scr.nextLine();


            //wczytaj wybor uzytkownika
            switch (wybor) {
                case "1":                   //cudzyslow bo String
                    //teraz to do:
                    //wczytywanie informacji o komputerza
                    //pyt.o cene nazwe i ram + id automatem
                    System.out.println("Dodaj komputer");
                    /*System.out.println("podaj id?");
                    long id_d = scr.nextLong();
                    scr.nextLine();  //czyści ten enter z ponizej lub mozna uzyc scr.next()*/
                    System.out.println("podaj nazwe?");
                    String nazwa_d = scr.next();
                    System.out.println("podaj cene?");
                    BigDecimal cena_d = scr.nextBigDecimal();    //uwaga! przy tych numerycznych np. int tez.
                    //np. 3,14\n(enter)
                    scr.nextLine();     //to jest po to aby powyzszy enter nie wpad l pod marke
                    System.out.println("podaj marka?");
                    String marka_d = scr.next();
                    System.out.println("podaj ram?");
                    int ram_d = scr.nextInt();
                    scr.nextLine(); //czyscimy znak nowej lini(enter)
                    Komputer k1 = new Komputer(nazwa_d,cena_d,marka_d,ram_d); //wrzuca te parametry //alt+enter pozwala w tym momencie wygenerowac konstruktor w komputer stworzyc
//                    Komputer k1 = new Komputer(); zamiast powyzej mozna setery uzyc
                    //hint: zmienna statyczna
                    System.out.println(k1);  // tu juz dostane z toString w Komputer zwrotka, czyli wszystkie dane w postaci String
                    sklep.dodajKomputer(k1);

                    //z 5rech informacji stworzyc komputer"obiekt"
                    //wywolac metode dodajKomputer klasy Sklep
                    //utworz pusty sklep


                    break;
                case "2":
                    System.out.println("Podaj id do usuniecia");
                    //to do:
                    //wczytaj id do usuniecia
                    //wywolac metode usunKomputer klasy Sklep
                    long id = scr.nextLong();
                    scr.nextLine();
                    sklep.usunKomputer(id);

                    break;
                case "3":
                    System.out.println("Lista");
                    //to do:
                    //wywolac metode wyswietl klasy Sklep
                    sklep.wyswietl();

                    break;
                case "q":
                case "Q":
                    System.out.println("koniec");
//                    return;                   //nie prawidlowo, bo nie uwzglednia while bo != nie do String, tylko typow prostych
                    break;
                default:
                    System.out.println("Podaj wyborrrr");      //lub tutaj info
                    break;
            }
//        }while(wybor != "q" || wybor != "Q");
        }while(!wybor.equalsIgnoreCase("q"));   //equals zawsze do Stringow musi byc uzywany
//
    }
}
