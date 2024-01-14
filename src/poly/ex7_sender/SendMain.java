package poly.ex7_sender;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new FacebookSender(), new SmsSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
