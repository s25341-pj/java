//zadanie 5.1
package pakiet1;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        //początek wykonywania programu
        long millisActualTime = System.currentTimeMillis();

        //utworzenie listy arrayList
        ArrayList arrayList = new ArrayList();

        //dodawanie do listy parzystych liczb całkowitych
        for (int i = 0; i < 100; i+=2){
            arrayList.add(i);
        }

        //wyswietlenie wszystkich pozcji z listy
        for (int i=0;i<50;i++){
            System.out.println(arrayList.get(i));
        }

        //koniec wykonywania programu oraz wyswietlenie czasu trwania programu
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Czas operacji: " + executionTime + "ms");
    }
}
