//zadanie 2.11
/*
public class Vehicle{

        String name;        //nazwa pojazdu
        int passengers;     //liczba pasazerow
        int fuelcap;        //pojemnosc zbiornika paliwa
        double lkm;         //zuzycie paliwa w litrach na 100 km

        //metoda nie zwraca nic; drukuje ilosc osob i oblicza w zaokrgleniu ilosc kilometrow
        void daneVehicle(){
                System.out.println(name + " przewozi " + passengers + " osob na odleglosc do " + Math.round(fuelcap/lkm*100) + " kilometrow.");
        }
}
*/
//zadanie 2.12
/*
public class Vehicle{

        //ustawienie private dla wartosci, aby nie bylo dostepu z zewnatrz
        private String name;        //nazwa pojazdu
        private int passengers;     //liczba pasazerow
        private int fuelcap;        //pojemnosc zbiornika paliwa
        private double lkm;         //zuzycie paliwa w litrach na 100 km

        //zastosowanie gettero dla pobierania i setterow dla ustawiania wartoscci
        public String getName(){
                return name;
        }
        public void setName(String newName){
                this.name = newName;
        }
        public int getPassengers(){
                return passengers;
        }
        public void setPassengers(int newPassengers){
                this.passengers = newPassengers;
        }
        public int getFuelcap(){
                return fuelcap;
        }
        public void setFuelcap(int newFuelcap){
                this.fuelcap = newFuelcap;
        }
        public double getLkm(){
                return lkm;
        }
        public void setLkm(double newLkm){
                this.lkm = newLkm;
        }

        //metoda nie zwraca nic; drukuje ilosc osob i zasieg
        void range(){
                double zasieg;
                zasieg = Math.round(fuelcap/lkm*100);
                System.out.println(name + " przewozi " + passengers + " osob.\nZasieg (km): " + zasieg);
        }
}
 */
//zadanie 2.13
/*
public class Vehicle{

        //ustawienie private dla wartosci, aby nie bylo dostepu z zewnatrz
        private String name;        //nazwa pojazdu
        private int passengers;     //liczba pasazerow
        private int fuelcap;        //pojemnosc zbiornika paliwa
        private double lkm;         //zuzycie paliwa w litrach na 100 km

        //zastosowanie gettero dla pobierania i setterow dla ustawiania wartoscci
        public String getName(){
                return name;
        }
        public void setName(String newName){
                this.name = newName;
        }
        public int getPassengers(){
                return passengers;
        }
        public void setPassengers(int newPassengers){
                this.passengers = newPassengers;
        }
        public int getFuelcap(){
                return fuelcap;
        }
        public void setFuelcap(int newFuelcap){
                this.fuelcap = newFuelcap;
        }
        public double getLkm(){
                return lkm;
        }
        public void setLkm(double newLkm){
                this.lkm = newLkm;
        }

        //metoda nie zwraca nic; drukuje ilosc osob i zasieg
        String range(){
                String zasieg;
                zasieg = name + " przewozi " + passengers + " osob na odleglosc do " + Math.round(fuelcap/lkm*100) + " kilometrow.";
                return zasieg;
        }
}
 */
//zadanie 2.14
/*
public class Vehicle{

    //metoda zwraca wartosc typu boolean prawa jesli podany parametr jest liczba parzysta, falsz jesli parametr jest liczcba nieparzysta
    public boolean czyParzysta(int liczba){
        if(liczba % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
 */
//zadanie 2.15
/*
public class Vehicle{

    //ustawienie private dla wartosci, aby nie bylo dostepu z zewnatrz
    private String name;        //nazwa pojazdu
    private int passengers;     //liczba pasazerow
    private int fuelcap;        //pojemnosc zbiornika paliwa
    private double lkm;         //zuzycie paliwa w litrach na 100 km

    //zastosowanie gettero dla pobierania i setterow dla ustawiania wartoscci
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int newPassengers){
        this.passengers = newPassengers;
    }
    public int getFuelcap(){
        return fuelcap;
    }
    public void setFuelcap(int newFuelcap){
        this.fuelcap = newFuelcap;
    }
    public double getLkm(){
        return lkm;
    }
    public void setLkm(double newLkm){
        this.lkm = newLkm;
    }

    //metoda nie zwraca nic; drukuje ilosc osob i zasieg
    String range(){
        String zasieg;
        zasieg = name + " przewozi " + passengers + " osob na odleglosc do " + Math.round(fuelcap/lkm*100) + " kilometrow.";
        return zasieg;
    }

    //metoda zwraca wartosc typu double; oblicza na postawie podanego parametru i zwraca wartosc spalania
    public double odleglosc(int dystans){
        double spalanie = dystans * (lkm/100);
        return spalanie;
    }
}
 */