//zadanie4.2
public class Ford extends Car implements Purchase{

    //zmienne year, manufacturerDiscount
    public int year;
    public int manufacturerDiscount;

    //przypisanie wartoscci do zmiennych wykorzystujac zmienna super do klasy nadrzednej
    // oraz odwolania do obiektu wykorzystujac this
    Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //metoda zwraca obnizona cene o manufacturerDiscount
    @Override
    public double getSalePrice(){
        double x = super.regularPrice - this.manufacturerDiscount;
        return x;
    }

    //interfejs zwracajacy nazwe klasy
    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
