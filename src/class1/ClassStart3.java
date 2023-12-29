package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 메모리에 만들고 메모리 주소를 student1 변수에 저장
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();// 학생을 메모리에 만들고 메모리 주소를 student2 변수에 저장
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 95;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름 = " + student1.name + " 나이 = " + student1.age + " 성적 = " + student1.grade);
        System.out.println("이름 = " + student2.name + " 나이 = " + student2.age + " 성적 = " + student2.grade);
    }
}
