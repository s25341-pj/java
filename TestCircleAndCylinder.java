//zadanie 4.1
public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle ob1 = new Circle(1, "blue");
        Cylinder ob2 = new Cylinder (1,4);

        System.out.println("The ob1 has radius of " + ob1.getRadius() + " and area of " + ob1.getArea() + " and color of " + ob1.getColor() + " and height of " + ob2.getHeight() + " and volume of " + ob2.getVolume());
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());

    }
}
