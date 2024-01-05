package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        System.out.println();

        speaker.volumeUp();
        speaker.showVolume();
        System.out.println();

        speaker.volumeUp();
        speaker.showVolume();
        System.out.println();

        System.out.println("volume 필드에 직접 접근 수정");
        //speaker.volume= 200;
        speaker.showVolume();
    }
}
