package access.b;

import access.a.AccessData;

// 다른 패키지에서 default 접근 제어자 접근 불가능
public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 는 다른 패키지 내에서 호출 불가능
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가능
        // data.privateField = 3;
        // data.privateMethod();

        System.out.println();
        data.innerAccess();
    }
}
