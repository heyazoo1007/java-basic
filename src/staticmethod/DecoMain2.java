package staticmethod;

public class DecoMain2 {

    public static void main(String[] args) {
        String str = "hello java";
        String deco = DecoUtil2.deco(str);

        System.out.println("before : " + str);
        System.out.println("after : " + deco);
    }
}
