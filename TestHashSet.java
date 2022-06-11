//zadanie 6.2
package pakiet2;

import java.util.*;

public class TestHashSet {

    public static void main(String[] args) {

        //utworzenie zbioru i uzupelnienie wartosciami
        HashSet<String> lista = new HashSet<>();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");


        System.out.println(lista);

        //utworzenie tablicy dostosowujac rozmiar
        String[] tablica = new String[lista.size()];

        //inicjowanie zmiennej
        int i = 0;

        //przekonwertowanie na zwykla tablice
        for(String element:lista){
            tablica[i++] = element;
        }

        //wyswietlenie elementow tablicy
        for(String element:tablica){
            System.out.println(element);
        }
    }
}
