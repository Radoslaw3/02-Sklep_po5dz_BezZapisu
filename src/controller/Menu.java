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
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - dodaj komputer");
        System.out.println("2 - usun komputer");
        System.out.println("3 - wyswietl liste komputerow");
        System.out.println("4-dodaj drona");
        System.out.println("wyjdz");
        String wybor;

        do {
            System.out.println("Podaj wybor");
            wybor = scanner.nextLine();


            //wczytaj wybor uzytkownika
            switch (wybor) {
                case "1":                   //cudzyslow bo String
                    // wczytywanie informacji o komputerze
                    System.out.print("Podaj nazwe: ");
                    String nazwa = scanner.nextLine();
                    System.out.print("Podaj cene: ");
                    BigDecimal cena = scanner.nextBigDecimal();
                    scanner.nextLine();
                    System.out.print("Podaj marke: ");
                    String marka = scanner.nextLine();
                    System.out.print("Podaj ilosc GB ramu: ");
                    int ram = scanner.nextInt();
                    scanner.nextLine(); // 3\n
                    // stworzyc obiekt typu Komputer
                    Komputer komputer = new Komputer(nazwa, cena, marka, ram);

                    // wywolac metode dodaj klasy Sklep
                    sklep.dodaj(komputer);


                    break;
                case "2":
                    System.out.println("Podaj id do usuniecia");
                        //to do:
                        //wczytaj id do usuniecia
                        //wywolac metode usunKomputer klasy Sklep
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    sklep.usunKomputer(id);

                    break;
                case "3":
                    System.out.println("Lista");
                        //to do:
                        //wywolac metode wyswietl klasy Sklep
                    sklep.wyswietl();

                    break;
                case "4":

                    System.out.println("Podaj nazwe?");  nazwa = scanner.next();
                    System.out.println("Podaj cene?");  cena= scanner.nextBigDecimal();
                    scanner.nextLine();
                    System.out.println("Podaj zasieg?"); double zasieg = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Czy ma kamere?"); String czyMaKamere = scanner.next();

                    Dron dron = new Dron(nazwa,cena,zasieg,czyMaKamere);
                    sklep.dodaj(dron);

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
