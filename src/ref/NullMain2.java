package ref;

// NullPointerException : 주소값(참조값)이 null 인 객체를 찾으려할 때 발생하는 예외
public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data);
    }
}
