package class1;

// 클래스가 필요한 이유 -> student 정보를 수정/삭제 해야할 때 번거롭기도 하고, 에러 위험성이 있다.
public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 85};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 = " + studentNames[i] + " 나이 = " + studentAges[i] + " 성적 = " + studentGrades[i]);
        }
    }
}
