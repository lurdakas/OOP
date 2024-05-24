import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book1 = new Book();
        book1.setTitle("The Fellowship of the Ring");
        book1.setPages(423);
        book1.setReleaseYear(1954);
        System.out.println(book1);


        Book book2 = new Book();
        book2.setTitle("The Two Towers");
        book2.setPages(352);
        book2.setReleaseYear(1955);
        System.out.println(book2);


        Book book3 = new Book();
        book3.setTitle("The Return of the King");
        book3.setPages(464);
        book3.setReleaseYear(1955);
        System.out.println(book3);



        Book book4 = new Book("Hobbit", 320, 1937);
        Book book5 = new Book("Murder On The Orient Express", 222, 1934);
        Book book6 = new Book("Dead Poets Society", 176,1988);


        book1.fullname();
        book2.fullname();
        book3.fullname();

        book4.fullname();
        book5.fullname();
        book6.fullname();





    }
}