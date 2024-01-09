package staticmethod.ex.ex2;

import static staticmethod.ex.ex2.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 7, 10000};
        System.out.println("배열 원소의 총 합 : " + sum(values));
        System.out.println("배열 원소의 평균 : " + average(values));
        System.out.println("배열 최댓값 : " + max(values));
        System.out.println("배열 최솟값 : " + min(values));
    }
}
