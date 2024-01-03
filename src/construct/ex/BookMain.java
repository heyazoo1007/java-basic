package construct.ex;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("a", "b");
        book2.displayInfo();

        Book book3 = new Book("c", "d", 300);
        book3.displayInfo();
    }
}
