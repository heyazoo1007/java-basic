package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Animal 은 부모, 부모는 자식을 담을 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 파라미터 부분(Animal animal)이 여기서 핵심
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
