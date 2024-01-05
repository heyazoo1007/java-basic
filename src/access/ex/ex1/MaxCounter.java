package access.ex.ex1;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 넘었습니다. " + count);
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
