//zadanie 2.11
/*
public class VehicleProg{

    public static void main(String[] args){

        //utworzenie klass i przypisanie do obiektow ich stalych parametrow
        Vehicle miniVan = new Vehicle();
        miniVan.name = "Minivan";
        miniVan.passengers = 9;
        miniVan.fuelcap = 75;
        miniVan.lkm = 4.5;

        Vehicle sportsCar = new Vehicle();
        sportsCar.name = "Auto sportowe";
        sportsCar.passengers = 2;
        sportsCar.fuelcap = 50;
        sportsCar.lkm = 12;

        //wywolanie metody dla utworzonych klass ktora wydrukuje informacje o ilosci pasarzerow i kilometrow
        miniVan.daneVehicle();
        sportsCar.daneVehicle();
    }
}
 */
//zadanie 2.12
/*
public class VehicleProg{

    public static void main(String[] args){

        //utworzenie klass i ustawienie parametrow dla private obiektow
        Vehicle miniVan = new Vehicle();
        miniVan.setName("Minivan");
        miniVan.setPassengers(9);
        miniVan.setFuelcap(75);
        miniVan.setLkm(4.5);

        Vehicle sportsCar = new Vehicle();
        sportsCar.setName("Auto sportowe");
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(12);

        //wywolanie metody dla utworzonych klass ktora wydrukuje informacje o ilosci pasarzerow i kilometrow
        miniVan.range();
        sportsCar.range();
    }
}
 */
//zadanie 2.13
/*
public class VehicleProg{

    public static void main(String[] args){

        //utworzenie klass i ustawienie parametrow dla private obiektow
        Vehicle miniVan = new Vehicle();
        miniVan.setName("Minivan");
        miniVan.setPassengers(9);
        miniVan.setFuelcap(75);
        miniVan.setLkm(4.5);

        Vehicle sportsCar = new Vehicle();
        sportsCar.setName("Auto sportowe");
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(12);

        //wywolanie metody, ktora drukuje zwracana wartosc
        System.out.println(miniVan.range());
        System.out.println(sportsCar.range());
    }
}
 */
//zadanie 2.14
/*
import java.util.Scanner;
public class VehicleProg{

    public static void main(String[] args){


        int liczba;                                     //zdefiniowanie zmiennej
        Vehicle sprawdzenie = new Vehicle();
        System.out.println("Podaj liczbe, aby sprawzic czy jest parzysta: ");
        Scanner scanner = new Scanner(System.in);       //wprowadzenie wartosci dla zmiennej
        liczba = scanner.nextInt();                     //przypisanie podanej wartosci dla zmiennej

        //funkcja warunkowa if sprawdzajaca czy wywołana metoda dla podanego parametru jest prawa czy falszem i wydrukowanie opowieniego komunikatu
        if (sprawdzenie.czyParzysta(liczba) == true) {
            System.out.println(liczba + " jest parzysta");
        }else{
            System.out.println(liczba + " jest nieparzysta");
        }
    }
}
 */
//zadanie 2.15
/*
import java.util.Scanner;
public class VehicleProg{

    public static void main(String[] args){

        //utworzenie klass i ustawienie parametrow dla private obiektow
        Vehicle miniVan = new Vehicle();
        miniVan.setName("Minivan");
        miniVan.setPassengers(9);
        miniVan.setFuelcap(75);
        miniVan.setLkm(4.5);

        Vehicle sportsCar = new Vehicle();
        sportsCar.setName("Auto sportowe");
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(12);

        int x;                                                                   //zefiniowanie zmiennej
        System.out.println("Podaj liczbe kilometrow jaka chcesz przejechac: ");
        Scanner scanner = new Scanner(System.in);                                //wprowadzenie wartosci dla zmiennej
        x = scanner.nextInt();                                                   //przypisanie podanej wartosci dla zmiennej

        //wyrukowanie metody dla utworzonych klass, metoda zwraca wartosc ktora po podaniu parametru oblicza zurzycie paliwa
        System.out.println("Minivan potrzebje do przejechania " + x + " kilometrow, " + miniVan.odleglosc(x) + " litrow paliwa.");
        System.out.println("Sportowy samochod do przejechania " + x + " kilometrow, " + sportsCar.odleglosc(x) + " litrow paliwa.");
    }
}
 */