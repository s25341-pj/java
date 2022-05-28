//zadanie 4.2
public class Car {

    //zmienne speed, regularPrice, color
    public int speed;
    public double regularPrice;
    public String color;

    //przypisanie zmiennych odwolujac sie do obiektu wykorzystujac this
    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //interfejs wykorzystujacy metode getSalePrice zwracajacy cene
    public double getSalePrice(){
        return this.regularPrice;
    }
}
