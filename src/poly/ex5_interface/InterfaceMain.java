package poly.ex5_interface;

import poly.ex4_pure_abstract.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
        // 인터페이스는 인스턴스 생성 불가 - 순수 추상 클래스이기 때문
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
