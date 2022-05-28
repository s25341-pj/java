//zaddanie 4.1
public class Cylinder extends Circle {

    //prywatne zmienne height, volume
    private double height;
    private double volume;

    //przypisanie stalych wartosci do zmiennych
    Cylinder(){
        height = 4;
    }

    //przypisanie stalej wartoscci height oraz wskazaniem parametru zmiennej radius
    Cylinder(double radius){
        setCircle(radius);
        height = 4;
    }

    //przypisanie zmiennych height oraz wskazaniem parametru zmiennej radius
    Cylinder(double radius, double height){
        setCircle(radius);
        this.height = height;
    }

    //ustawienie metod getter i setter dla wskazanaych zmiennych
    public double getHeight() {
        return height;
    }

    //metoda obliczajaca objetoscc wykorzystujaccc zmienna height oraz metode ktora obliczała powierzchnie
    public double getVolume() {
        volume = getArea() * height;
        return volume;
    }

    //metoda toString zwracająca wartosci zmiennych do stringa
    public String toString(){
        return "Cylinder: height = " + this.height;
    }
}
