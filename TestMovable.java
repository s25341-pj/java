//zadanie 5.2
package pakiet2;

public class TestMovable {

    public static void main(String[] args) {

        //utworzenie instancji i zainicjowanie wartosciami oraz wyświetlenie
        MovablePoint movablePoint = new MovablePoint(5,5);
        System.out.println(movablePoint.toString());

        //zmiana parametrow wykorzystujac konstruktory
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());

        movablePoint.moveDown();
        System.out.println(movablePoint.toString());

        movablePoint.moveLeft();
        System.out.println(movablePoint.toString());

        movablePoint.moveRight();
        System.out.println(movablePoint.toString());
    }
}
