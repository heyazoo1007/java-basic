package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 같은 클래스명은 직접 경로 다 입력해야 함
    }
}
