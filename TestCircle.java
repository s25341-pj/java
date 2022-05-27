//zaddanie 3.1
public class TestCircle{
    public static void main(String[] args) {
        Circle myCircle1 = new Circle();
        Circle myCircle2 = new Circle(2);
        Circle myCircle3 = new Circle(4, "blue");
        Circle myCircle4 = new Circle();
        myCircle4.setRadius(7);
        myCircle4.setColor("green");

        System.out.println("The mycircle1 has radius of " + myCircle1.getRadius() + " and area of " + myCircle1.getArea() + " and color of " + myCircle1.getColor());
        System.out.println(myCircle1.toString());
        System.out.println("The mycircle2 has radius of " + myCircle2.getRadius() + " and area of " + myCircle2.getArea() + " and color of " + myCircle2.getColor());
        System.out.println(myCircle2.toString());
        System.out.println("The mycircle3 has radius of " + myCircle3.getRadius() + " and area of " + myCircle3.getArea() + " and color of " + myCircle3.getColor());
        System.out.println(myCircle3.toString());
        System.out.println("The mycircle4 has radius of " + myCircle4.getRadius() + " and area of " + myCircle4.getArea() + " and color of " + myCircle4.getColor());
        System.out.println(myCircle4.toString());
    }
}