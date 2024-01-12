package poly.ex6_abstract_and_interface;

public abstract class AbstractAnimal {

    public abstract void sound(); // 추상 목적

    // 상속 목적
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
