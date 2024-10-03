package access;


public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeDown();

        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; // 왜 접근 제어자가 필요 한 지 알 수 있음 설정된 max인 100을 강제로 바꿀 수 있기 때문
        speaker.showVolume();

    }
}
