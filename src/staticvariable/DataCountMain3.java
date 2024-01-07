package staticvariable;

public class DataCountMain3 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 data1 = new Data3("A");
        System.out.println("A.count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B.count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C.count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        // 권장하지 않음. 인스턴스 변수인지 혼란을 줄 수 있음
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
