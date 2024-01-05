package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("public 필드 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("default 필드 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("private 필드 호출 " + privateField );
    }

    // 내부 호출 시 클래스 내부 필드, 메서드 모두 접근 가능
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
