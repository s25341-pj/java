//zadanie 6.4
package pakiet4;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {

    public static void main(String[] args) {

        //wyswietlenie informacji dla uzytkownika
        System.out.println("Wprowadź wartość od 1 do 12");

        //wprowadzenie przez urzytkownika liczby
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //wykorzystanie klase HashMap oraz przypisanie elementom obiektu kluczy
        HashMap<Integer, String> miesiace = new HashMap<Integer, String>();
        miesiace.put(1, "Styczen");
        miesiace.put(2, "Luty");
        miesiace.put(3, "Marzec");
        miesiace.put(4, "Kwiecien");
        miesiace.put(5, "Maj");
        miesiace.put(6, "Czerwiec");
        miesiace.put(7, "Lipiec");
        miesiace.put(8, "Sierpien");
        miesiace.put(9, "Wrzesien");
        miesiace.put(10, "Pazdziernik");
        miesiace.put(11, "Listopad");
        miesiace.put(12, "Grudzien");

        //funkcja warunkowa if wypisujaca po kluczu zmapowana wartosc lub informujaca o zlym wyborze
        if (x < 13 && x > 0) {
            System.out.println("Wybrany miesiac to: " + miesiace.get(x));
        }else{
            System.out.println("Wprowadziles bledna wartosc.");
        }
    }
}
