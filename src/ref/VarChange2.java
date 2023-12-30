package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 참조값만 복사해서 dataB에 저장됨

        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
        System.out.println();

        dataA.value = 20;
        System.out.println("dataA.value = 20 변경");
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
        System.out.println();

        dataB.value = 30;
        System.out.println("dataB.value = 30 변경");
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
    }
}
