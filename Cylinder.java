//zaddanie 4.1
public class Cylinder extends Circle {
    private double height;
    private double volume;

    Cylinder(){                               //konstruktor z dwoma domyslnymi parametrami
        height = 4;
    }

    Cylinder(double radius){                  //konsruktor z jednym parametrem podanym i ddrugim domyslnym
        setCircle(radius);
        height = 4;
    }

    Cylinder(double radius, double height){                  //konsruktor z jednym parametrem podanym i ddrugim domyslnym
        setCircle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        volume = getArea() * height;
        return volume;
    }
    public String toString(){
        return "Cylinder: height = " + this.height;
    }
}
