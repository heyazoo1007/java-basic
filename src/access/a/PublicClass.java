package access.a;

// 하나의 파일 안에 여러개의 클래스 만들 수 있음.
// 단, 하나의 파일에는 하나의 public 클래스만 존재 가능하다.
public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 클래스 자기 자신으로 객체 생성 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}
class DefaultClass2 {

}
