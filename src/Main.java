import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book1 = new Book();
        book1.setTitle("The Fellowship of the Ring");
        book1.setPages(423);
        book1.setReleaseYear(1954);



        Book book2 = new Book();
        book2.setTitle("The Two Towers");
        book2.setPages(352);
        book2.setReleaseYear(1955);



        Book book3 = new Book();
        book3.setTitle("The Return of the King");
        book3.setPages(464);
        book3.setReleaseYear(1955);




        Book book4 = new Book("Hobbit", 320, 1937);
        Book book5 = new Book("Murder On The Orient Express", 222, 1934);
        Book book6 = new Book("Dead Poets Society", 176,1988);


        book1.fullname();
        book2.fullname();
        book3.fullname();

        ArrayList<Book> knygos = new ArrayList<>();
        knygos.add(book4);
        knygos.add(book5);
        knygos.add(book6);


        for (Book knyga : knygos) {
            knyga.fullname();
        }

        System.out.println("_______________________________");



        Plant Plant1 = new Plant();

        Plant1.setName("Gooseberry");
        Plant1.setLatinName("Ribes uva-crispa");
        Plant1.setAnnual(true);
        Plant1.setContinent("Europe");
        Plant1.setHeightUpTo(1);
        Plant1.setEdible(true);
        System.out.println(Plant1);


        Plant Plant2 = new Plant();

        Plant2.setName("Rhubarb");
        Plant2.setLatinName("Rheum × hybridum");
        Plant2.setAnnual(true);
        Plant2.setContinent("Europe");
        Plant2.setHeightUpTo(1);
        Plant2.setEdible(true);
        System.out.println(Plant2);



        Plant Plant3 = new Plant("Opium poppy", "Papaver somniferum", (true), "Europe",5, (true));
        Plant Plant4 = new Plant("Common Sunflower", "Helianthus annuus", (true), "Europe", 2,(true));


        System.out.println(Plant3);
        System.out.println(Plant4);


    }
}