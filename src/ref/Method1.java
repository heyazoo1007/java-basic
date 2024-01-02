package ref;

// 객체 생성 및 출력 함수로 리팩토링
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 18, 95);

        printStudent(student1);
        printStudent(student2);
    }

    // 전달한 학생 객체 필드에 값을 설정하는 함수
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 전달한 학생 객체의 필드값을 가져와 출력하는 함수
    // 변수 참조값을 파라미터로 넘기고, 거기에서 name, age, grade 가져옴
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
