package class1;

// 코드 리팩토링
// 1. 배열 최적화
// 2. 반복문으로 출력문 중복 줄이기
// 3. 반복문 최적화 -> 향상된 for 문 사용하기
public class ClassStart5 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 95;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 = " + students[i].name + " 나이 = " + students[i].age + " 성적 = " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("이름 = " + student.name + " 나이 = " + student.age + " 성적 = " + student.grade);
        }

        // 향상된 for 문
        for (Student student : students) {
            System.out.println("이름 = " + student.name + " 나이 = " + student.age + " 성적 = " + student.grade);
        }
    }
}
