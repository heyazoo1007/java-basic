package construct.constructor;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 객체 생성(new MemberConstructor) 후 생성자 불러라(MemberConstructor())
        MemberConstruct member1 = new MemberConstruct("a", 1, 2);
        MemberConstruct member2 = new MemberConstruct("b", 3, 4);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름 = " + member.name + ", 나이 = " + member.age + ", 성적 = " + member.grade);
        }
    }
}
