package staticmethod;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static 은 static 변수/메서드 에만 접근 가능
    public static void staticCall() {
        // instanceValue; 인스턴스 변수에 접근 불가능 -> compile error
        // instanceMethod(); 인스턴스 메서드에 접근 불가능 -> compile error
        staticValue++; // 정적 변수에 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
        staticValue++; // 정적 변수에 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    // 인스턴스 메서드에서는 정적/인스턴스 변수 및 메서드 모두 접근 가능
    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
