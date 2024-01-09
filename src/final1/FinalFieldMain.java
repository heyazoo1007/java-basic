package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        FinalConstructInit finalConstructInit1 = new FinalConstructInit(10);
        FinalConstructInit finalConstructInit2 = new FinalConstructInit(20);
        System.out.println("finalConstructInit1 = " + finalConstructInit1.value);
        System.out.println("finalConstructInit2 = " + finalConstructInit2.value);

        // final 필드 - 필드 초기화
        FinalFieldInit finalFieldInit1 = new FinalFieldInit();
        FinalFieldInit finalFieldInit2 = new FinalFieldInit();
        FinalFieldInit finalFieldInit3 = new FinalFieldInit();
        System.out.println("finalFieldInit.value = " + finalFieldInit1.value);
        System.out.println("finalFieldInit.value = " + finalFieldInit2.value);
        System.out.println("finalFieldInit.value = " + finalFieldInit3.value);

        // 상수에 접근
        System.out.println("상수 = static final 붙은 변수");
        System.out.println(FinalFieldInit.CONST_VALUE);
    }
}
