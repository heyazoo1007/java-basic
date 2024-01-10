package extends1.practice;

public class Book extends Item {
    private String author;
    private String isbn;


    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + author + ", isbn : " + isbn);
    }
}
