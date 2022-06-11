//zadanie 5.2
package pakiet2;

//klasa z zaimplementowanym interfejsem
public class MovablePoint implements Movable{

    //zmienne x i y
    int x;
    int y;

    //przypisanie zmiennych odwolujac sie do obiektu wykorzystujac this
    MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //przypisanie zmiennych odwolujac sie do obiektu wykorzystujac this
    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }


    //metoda toString zwracająca wartosci zmiennych do stringa
    @Override
    public String toString() {
        return "MovablePoint{ " + "x=" + x + ", y=" + y + " }";
    }
}
