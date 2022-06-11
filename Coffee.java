//zadanie 5.3
package pakiet3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Iterator;

public class Coffee {

    public static void main(String[] args) {

        //lista stringow
        ArrayList<String> coffee = new ArrayList<String>();
        coffee.add("espresso");
        coffee.add("latte");
        coffee.add("cappuccino");
        coffee.add("mocha");
        coffee.add("auLait");
        coffee.add("macchiato");

        //urzycie iteratora i wypisanie na konsole
        Iterator<String> coffes = coffee.iterator();
        System.out.println(coffee);

        //urzycie petli i wypisanie listy duzymi literami
        for (int i = 0; i < 6; i++)
            System.out.println(coffes.next());

        for(String n : coffee)
            System.out.println(n.toUpperCase(Locale.ROOT));

        //wypisanie na konsole pierwszych 4 liter
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(coffee.get(i).charAt(j));
            }
            System.out.println();
        }

    }
}
