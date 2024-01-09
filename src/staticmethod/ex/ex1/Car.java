package staticmethod.ex.ex1;

public class Car {
    private String name;
    private static int totalCars;

    public Car(String name) {
        System.out.println("차량 구입, 이름 : " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("총 자동차 개수 : " + totalCars);
    }
}
