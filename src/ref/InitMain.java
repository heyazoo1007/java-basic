package ref;

public class InitMain {

    public static void main(String[] args) {
        InitData initData = new InitData();
        System.out.println("initData.value1 = " + initData.value1); // 수동 초기화 안해도 알아서 int 0으로 초기화 된다
        System.out.println("initData.value2 = " + initData.value2);
    }
}
