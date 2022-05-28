//zadanie 4.2
public class Truck extends Car implements Purchase{

    //zmienne weight
    public int weight;

    //przypisanie wartoscci do zmiennych wykorzystujac zmienna super do klasy nadrzednej
    // oraz odwolania do obiektu wykorzystujac this
    Truck(int speed,double regularPrice,String color,int weight) {
        super(speed, regularPrice, color);
        this.weight=weight;
    }

    //metoda wykorzystujaca warunek zwraca wartosc po rabacie
    @Override
    public double getSalePrice(){
        if (weight > 2000){
            double h = 0.1;
            return super.regularPrice = super.regularPrice - (super.regularPrice * h);
        } else {
            return super.regularPrice;
        }
    }

    //interfejs zwracajacy nazwe klasy
    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}
