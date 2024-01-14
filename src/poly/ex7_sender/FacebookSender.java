package poly.ex7_sender;

public class FacebookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 알림을 전송합니다 : " + message);
    }
}
