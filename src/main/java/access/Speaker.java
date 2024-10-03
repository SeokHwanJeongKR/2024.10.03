package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp(){
        if(volume >= 100){
            System.out.println("최대 볼륨은 100까지 입니다, 더는 올릴 수 없습니다");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가 합니다");
        }
    }
    void volumeDown(){
        if(volume <= 0){
            System.out.println("최저 볼륨은 0까지 입니다, 더는 내릴 수 없습니다");
        } else {
            volume -= 10;
            System.out.println("볼륨을 10 감소 합니다");
        }
    }
    void showVolume(){
        System.out.println("현재 볼륨은 " + volume + "입니다");
    }
}
