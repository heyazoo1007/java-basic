package access.ex.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount == items.length) {
            System.out.println("쇼핑 카트가 꽉 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("카트 정보 출력");
        for (Item item : items) {
            if (item != null) {
                System.out.println("상품 이름 : " + item.getName() + ", 가격 : " + item.getTotalPrice());
            }
        }

        System.out.println("총 가격 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }
}
