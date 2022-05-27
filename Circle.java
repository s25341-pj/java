// zadanie 3.1
public class Circle {
    private double radius;
    private String color;

    Circle(){
        radius = 1;
        color = "red";
    }

    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
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

    public String toString(){
        return "Circle: radius = " + this.radius + " color = " + this.color;
    }

    void setCircle(double radius){
        this.radius = radius;
    }
}
