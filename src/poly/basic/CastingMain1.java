package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod(); -> 컴파일 에러 발생

        // 다운 캐스팅 (부모 타입 -> 자식 타입), 자바야 개발자인 내가 책임질게. 다운캐스팅.
        Child child = (Child) poly;
        child.childMethod();
    }
}
