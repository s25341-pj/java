//zadanie 3.2
public class TestAuthor {
    public static void main(String[] args) {
        Author ob = new Author("Bolesław", "Prus", 55);
        Author ob2 = new Author("Eliza", "Orzeszkowa", 34);

        System.out.println(ob.toString());

        ob.setSurname("Leśmian");

        System.out.println(ob.toString());
        System.out.println(ob2.toString());
    }
}
