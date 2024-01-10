package extends1.practice;

public class ShopMain {

    public static void main(String[] args) {
        Album album = new Album("앨범", 1, "아티스트");
        Book book = new Book("책", 2, "저자", "12345");
        Movie movie = new Movie("영화", 3, "감독", "배우");

        album.print();
        System.out.println();
        book.print();
        System.out.println();
        movie.print();
        System.out.println();

        int sum = album.getPrice() + book.getPrice() + movie.getPrice();
        System.out.println("상품 가격 총 합 : " + sum);
    }
}
