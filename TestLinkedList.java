//zadanie 6.1
package pakiet1;

import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {

        //utworzenie listy i uzupelnienie wartoscciami typu string
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");

        //wyswietlenie oryginalnej listy
        System.out.println("The oryginal linked list: " + lista);

        //usuniecie i wyswietlenie pierwszego elementu
        System.out.println("Elements removed: " + lista.removeFirst());

        //usuniecie i wyswietlenie ostatniego elementu
        System.out.println("Elements removed: " + lista.removeLast());

        //wyswietlenie nowej listy
        System.out.println("The new linked list: " + lista);
    }
}
