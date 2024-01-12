package poly.ex4_pure_abstract;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상 클래스 생성 불가
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();
        System.out.println();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        System.out.println();

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 이동 테스트 시작");
        abstractAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
