package class1.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 1;
        orders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치 ";
        productOrder2.price = 10000;
        productOrder2.quantity = 1;
        orders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "코카콜라 ";
        productOrder3.price = 3500;
        productOrder3.quantity = 2;
        orders[2] = productOrder3;

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품 이름 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            totalPrice += order.price * order.quantity;
        }
        System.out.println("총 가격 : " + totalPrice);
    }
}
