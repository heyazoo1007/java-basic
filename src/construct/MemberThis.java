package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 멤버 변수 이름 != 매개변수 이름 인 경우, this. 생략 가능!
    }
}
