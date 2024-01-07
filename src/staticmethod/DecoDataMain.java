package staticmethod;

//import staticvariable.Data3;
//import static staticmethod.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        System.out.println();

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData = new DecoData();
        decoData.instanceCall();
        System.out.println();

        System.out.println("2. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();
        System.out.println();

        DecoData.staticCall(decoData);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data = new DecoData();
        data.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
