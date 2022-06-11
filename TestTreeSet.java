//zadanie 6.3
package pakiet3;

import java.util.*;

public class TestTreeSet {

    public static void main(String[] args) {

        //utworzenie obiektu i zaimplementowanie wartosciami string oraz wyswietlenie zawartosci drzewa
        TreeSet<String> tree1 = new TreeSet<>();
        System.out.println();
        tree1.add("Red");
        tree1.add("Green");
        tree1.add("Black");
        tree1.add("Pink");
        tree1.add("Orange");
        System.out.println("pierwsze drzewo: " + tree1);

        //poiterowanie zawartosci pierwszego drzewa
        Iterator<String> tree1it = tree1.iterator();
        for (String element : tree1) {
            System.out.println(tree1it.next());
        }

        //utworzenie ddrugiego obiektu i zaimplementowanie wartosciami string oraz wyswietlenie zawartosci drugiego drzewa
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Black");
        tree2.add("Red");
        tree2.add("White");
        System.out.println("drugie drzewo: " + tree2);

        //dodawanie drugiego elementu do pierwszego elementu i wyswietlenie calej listy
        tree1.addAll(tree2);

        System.out.println();
        System.out.println("Połączone obiekty w pierwszym drzewie (cala nowa lista): " + tree1);
        System.out.println();

        //wyswietlenie w odwrotnej kolejnosci
        System.out.println("tree1 w odwrotnej kolejności:");
        System.out.println(tree1.descendingSet());
        System.out.println();

        //wyswietlenie pierwszego i ostatniego elementu pierwszego obiektu
        System.out.println("pierwszy element obiektu tree1: " + tree1.first()); // e
        System.out.println("ostatni element obiektu tree1: " + tree1.last());
        System.out.println();

        //klonowanie obiektu pierwszego jako tree3
        TreeSet<String> tree3 = (TreeSet) tree1.clone();

        //wyswietlenie obiektu trzeciego
        System.out.println("drzewo3: " + tree3);
        System.out.println();

        //liczy i wyswietla liczbe przechowywanych elementow w obiekcie pierwszym
        System.out.println("liczba elementow w drzewie tree1: " + tree1.size());
        System.out.println();

        //porownanie elementow z pierwszego obiektu z drugim oraz wysiwtlenie czy sa takie same
        String element1[] = new String[6];
        element1 = tree1.toArray(element1);

        String element2[] = new String[6];
        element2 = tree2.toArray(element2);

        System.out.println("porównanie drzew tree1 i tree2:");

        for(int i = 0; i < 6; i++) {
            if(element1[i].equals(element2[i]) == true){
                System.out.println((i+1) + " element drzewa 1 i 2 jest równy");
            }else
                System.out.println((i+1) + " element drzewa 1 i 2 nie jest równy");
        }
    }
}
