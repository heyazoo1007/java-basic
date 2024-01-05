package access.a;

// 같은 패키지 내에서 private 외에 다른 접근 제어자 접근 가능
public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default는 같은 패키지 내에서 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가능
        //data.privateField = 3;
        //data.privateMethod();

        System.out.println();
        data.innerAccess();
    }
}
