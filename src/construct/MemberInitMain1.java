package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "a";
        member1.age = 1;
        member1.grade = 2;

        MemberInit member2 = new MemberInit();
        member2.name = "b";
        member2.age = 3;
        member2.grade = 4;

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름 = " + member.name + ", 나이 = " + member.age + ", 성적 = " + member.grade);
        }
    }
}
