//zaddanie 3.2
public class Author {
    private String name;
    private String surname;
    private int age;

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

    Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString(){
        return "Author name = " + this.name + " surname = " + this.surname + " age = " + this.age;
    }
}
