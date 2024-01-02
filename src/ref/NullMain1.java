package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. date = " + data);

        data = new Data(); // 참조 Data 인스턴스 참조값 data 에 대입
        System.out.println("2. date = " + data);

        data = null;
        System.out.println("3. date = " + data);
    }
}
