// zadanie 3.1
public class Circle {

    //ustawienie prywatnych zmiennych radius, color
    private double radius;
    private String color;

    //przypisanie stalych wartosci do zmiennych
    Circle(){
        radius = 1;
        color = "red";
    }

    //przypisanie stalej wartoscci color oraz wskazaniem parametru zmiennej radius
    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    //przypisanie zmiennych radius i color wykorzystujac this
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //metoda obliczajaca powierzchnie i zwracajaca wartosc area
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    //ustawienie metod getter i setter dla wskazanaych zmiennych
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metoda toString zwracająca wartosci zmiennych do stringa
    public String toString(){
        return "Circle: radius = " + this.radius + " color = " + this.color;
    }

    //metoda do zadania 4.1 do klasy Cylinder
    void setCircle(double radius){
        this.radius = radius;
    }
}
