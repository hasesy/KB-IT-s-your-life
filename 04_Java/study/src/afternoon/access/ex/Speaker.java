package afternoon.access.ex;

public class Speaker {
    private int volume;
    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;

    public Speaker() {
        this.volume = 20;
        System.out.println("현재 볼륨 : " + this.volume);
    }

    public void volumeUp() {
        if (isVaildMax()) {
            this.volume += 1;
            System.out.println("현재 볼륨 : " + this.volume);
        } else {
            printLimit();
        }
    }

    public void volumeDown() {
        if (isVaildMin()) {
            this.volume -= 1;
            System.out.println("현재 볼륨 : " + this.volume);
        } else {
            printLimit();
        }
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다.");
    }

    private boolean isVaildMin() {
        return this.volume > MIN_VOLUME;
    }

    private boolean isVaildMax() {
        return this.volume < MAX_VOLUME;
    }

    private void printLimit() {
        System.out.println("더 이상 볼륨 조절이 불가능합니다.");
    }
}
