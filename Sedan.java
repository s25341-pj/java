//zadanie 4.2
public class Sedan extends Car implements Purchase{

    //zmienna length
    public int length;

    //przypisanie wartoscci do zmiennych wykorzystujac zmienna super do klasy nadrzednej
    // oraz odwolania do obiektu wykorzystujac this
    Sedan(int speed,double regularPrice,String color,int length) {
        super(speed, regularPrice, color);
        this.length=length;
    }

    //metoda wykorzystujaca warunek zwraca wartosc po rabacie
    @Override
    public double getSalePrice(){
        if (this.length > 20){
            double h = 0.05;
            return super.regularPrice = super.regularPrice - (super.regularPrice * h);
        } else {
            double l = 0.1;
            return super.regularPrice = super.regularPrice - (super.regularPrice * l);
        }
    }

    //interfejs zwracajacy nazwe klasy
    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}
