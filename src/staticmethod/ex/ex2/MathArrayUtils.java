package staticmethod.ex.ex2;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성하지 못하게 private 생성자 만듦
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (maxValue < value) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }
}
