package ref.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 1);
        orders[1] = createOrder("김치", 10000, 1);
        orders[2] = createOrder("코카콜라", 3500, 2);

        printOrders(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println("총 가격 : " + totalPrice);
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 이름 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    // 배열 또 한번 더 넘겨서 최종 가격 반환하면 됨
    static int getTotalPrice(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }
}
