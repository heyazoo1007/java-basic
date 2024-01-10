package poly.basic;

// instanceof 에 대해서
public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        System.out.println();

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스가 맞음");
            ((Child) parent).childMethod();
        }
    }
}
