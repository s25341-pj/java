//zadanie 3.2
public class TestAuthor {
    public static void main(String[] args) {

        //utworzenie instancji i zainicjowanie wartosciami
        Author ob = new Author("Bolesław", "Prus", 55);
        Author ob2 = new Author("Eliza", "Orzeszkowa", 34);

        //wyswietlenie wynikow
        System.out.println(ob.toString());

        //zmiana wartosci zmiennej dla obiektu ob
        ob.setSurname("Leśmian");

        //wyswietlenie wynikow
        System.out.println(ob.toString());
        System.out.println(ob2.toString());
    }
}
