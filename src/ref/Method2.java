package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 18, 95);

        printStudent(student1);
        printStudent(student2);
    }

    // 인스턴스 생성, 초기값 설정
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    // 전달한 학생 객체의 필드값을 가져와 출력하는 함수
    // 변수 참조값을 파라미터로 넘기고, 거기에서 name, age, grade 가져옴
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }
}
