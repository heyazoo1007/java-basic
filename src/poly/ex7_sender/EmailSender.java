package poly.ex7_sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일을 전송합니다 : " + message);
    }
}
