package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // final 에 두번째 값 할당 시 컴파일 오류 발생

        // final 지역 변수2
        final int data3 = 30;
        // data3 = 40; // 컴파일 오류 발생
    }

    static void method(final int parameter) {
        // parameter = 10; // final 매개변수 값 재설정 안됨
    }
}
