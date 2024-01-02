package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문의 개수를 입력하세요 : ");
        int nextInt = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[nextInt];

        for (int i = 0; i < nextInt; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

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
