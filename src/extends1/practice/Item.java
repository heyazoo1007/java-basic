package extends1.practice;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    protected void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }
}
