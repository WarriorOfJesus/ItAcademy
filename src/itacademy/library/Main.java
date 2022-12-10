package itacademy.library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Mikhalych", "Skazki Andersana", 1247, "dyadya Stepa", false);
        System.out.println(book1);
        book1.setAuthor("Masha");
        System.out.println(book1);
    }
}
