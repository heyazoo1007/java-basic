package staticmethod;

public class DecoMain1 {

    public static void main(String[] args) {
        String str = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(str);

        System.out.println("before : " + str);
        System.out.println("after : " + deco);
    }
}
