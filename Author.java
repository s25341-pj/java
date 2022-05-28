//zaddanie 3.2
public class Author {

    //prywatne zmienne name, surname, age
    private String name;
    private String surname;
    private int age;

    //ustawienie metod getter i setter dla wskazanaych zmiennych
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    //przypisanie zmiennych odwolujac sie do obiektu wykorzystujac this
    Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //metoda toString zwracająca wartosci zmiennych do stringa
    public String toString(){
        return "Author name = " + this.name + " surname = " + this.surname + " age = " + this.age;
    }
}
