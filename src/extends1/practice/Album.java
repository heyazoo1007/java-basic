package extends1.practice;

public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }
}
